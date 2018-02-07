import logging
import os
import sys
import subprocess
import pwd
import io
import humingocommons

logger = logging.getLogger("CommandCenter")

class Build:
    
    def __init__(self, configObject):
        self.configObject=configObject
        self.javaHome=configObject.getJavaHome()

    def cleanBuild(self):
        dirName = self.configObject.checkoutDirectory
        releaseName = self.configObject.releaseBranch
        projectName = self.configObject.projectName
        environment = self.configObject.environment
        skipTest = self.configObject.skipTest
        humingocommons.createDirectory(dirName)
	humingocommons.changeDir(dirName)
        self.clone(dirName,projectName,releaseName)
	# Path separator proper way - http://stackoverflow.com/questions/1499019/how-to-get-the-path-separator-in-python
	releaseDir=dirName+os.sep+projectName
	humingocommons.changeDir(releaseDir)
	self.install(skipTest,environment)

    def buildOnly(self):
        dirName = self.configObject.checkoutDirectory
        releaseName = self.configObject.releaseBranch
        projectName = self.configObject.projectName
        environment = self.configObject.environment
        skipTest = self.configObject.skipTest
       	releaseDir = dirName+os.sep+projectName
	humingocommons.changeDir(releaseDir)
	self.checkout(dirName,releaseName)	
	self.install(skipTest,environment)

    def compileOnly(self):
        dirName = self.configObject.checkoutDirectory
        projectName = self.configObject.projectName
        environment = self.configObject.environment
        releaseDir = dirName+os.sep+projectName
	humingocommons.changeDir(releaseDir)
	logger.info("Doing compile with presets in directory %s",releaseDir)
	compileCommand = "mvn -U -P "+environment+" clean compile "
        logger.debug("Maven build using="+compileCommand)
	humingocommons.makeoscall(compileCommand)

    def clone(self,dirName, toClone, releaseName):
	logger.info("Starting cloning process with presets dirName=%s, projectName=%s, releaseBranch=%s",dirName, toClone, releaseName)
        #I need to find a way to ensure if git command actually exists
        # This url might be a good reference-http://superuser.com/questions/148851/python-check-existence-of-shell-command-before-execution
        # I would like to have all the commands be present as constants - http://code.activestate.com/recipes/65207-constants-in-python/?in=user-97991
        if((dirName and not dirName.isspace()) and (toClone and not toClone.isspace()) and (releaseName and not releaseName.isspace())):           
            if(releaseName!="master"):
                cloneCommand = "git clone git@bitbucket.org:tissow/"+toClone+".git --branch "+releaseName
            else:
                cloneCommand = "git clone git@bitbucket.org:tissow/"+toClone+".git"
        else:
            logger.fatal("You cannot clone your git repository unless all the three arguments dirName=%s, projectName=%s, releaseBranch=%s are properly specified",dirName, toClone, releaseName);
            raise RuntimeError("Incomplete arugments offered cloning, check previous logging")

	logger.info("Cloning with command="+cloneCommand)
	humingocommons.makeoscall(cloneCommand)


    def checkout(self,dirName, toCheckout):
	logger.info("Starting checkout process with presets, directory="+dirName+", checkout target="+toCheckout)
	checkoutCommand = "git pull origin "+toCheckout
	logger.debug("Checking out source using="+checkoutCommand)
	humingocommons.makeoscall(checkoutCommand)

    def install(self,shouldTest, environ):
        logger.info("Exporting JAVA HOME with path %s",self.javaHome)
        javaHomeCommand = "export JAVA_HOME="+self.javaHome
        humingocommons.makeoscall(javaHomeCommand)
	logger.info("Doing install with presets, should test="+shouldTest)
	installCommand = javaHomeCommand+";"+"mvn -U -P "+environ+" clean compile install -Dmaven.test.skip="+shouldTest
        logger.debug("Maven build using="+installCommand)
	humingocommons.makeoscall(installCommand)	

    

    
