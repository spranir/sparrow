#Its is absolutely surprsing to me that we do not have multiline comments, but I am
#not complaining as it was one guido who wrote the entire thing to start with.
import os
import sys
import subprocess
import pwd
import ConfigParser
import io
import logging
import argparse
import logging.handlers
from humingoconfiguration import Configuration
from humingobuild import Build
from humingoinstallbatch import InstallBatch
from humingoinstallweb import InstallWeb
from humingoinstallnrt import InstallNrt
from humingoruntimebatch import ExecuteBatch
#Refer-https://docs.python.org/2/howto/logging-cookbook.html
#Refer - http://victorlin.me/posts/2012/08/26/good-logging-practice-in-python
LOG_FILE_NAME = 'commandcenter.log'
CFG_FILE_NAME = 'commcenter.cfg'

logger = logging.getLogger("CommandCenter")
formatter = logging.Formatter("%(asctime)s - %(name)s - %(levelname)s - %(message)s")
logger.setLevel(logging.DEBUG)

fileHandler = logging.handlers.RotatingFileHandler(LOG_FILE_NAME,
                                               maxBytes=1000000,
                                               backupCount=5
                                               )
fileHandler.setLevel(logging.INFO)
fileHandler.setFormatter(formatter)
logger.addHandler(fileHandler)

consoleHandler = logging.StreamHandler()
consoleHandler.setLevel(logging.DEBUG)
consoleHandler.setFormatter(formatter)

logger.addHandler(consoleHandler)
	
def initialize(commandLineConfig):
	configFile = commandLineConfig.configFilePath
        config = readConfig(configFile)
        configObj=Configuration(commandLineConfig,config)
        return configObj

#Refered this link - http://pymotw.com/2/argparse/
def readConfig(configFile):
        config = ConfigParser.ConfigParser()
        if(configFile and not configFile.isspace()):
                if os.path.exists(configFile):
                        config.read(configFile)
                else:
                        raise RuntimeError("If you intend to use your own config file"+
                        "(by default commcenter has its own config file),"+
                        "then ensure the path is correct."+
                        "The config file path you gave is absent="+configFile)
        else:
                config.read(CFG_FILE_NAME)
        return config

def loadParsedArgs():
        parser = argparse.ArgumentParser(description='Humingo Command center application')
	parser.add_argument('-c','--command', 
                            action="store", 
                            dest="command", 
                            help="Possible commands(cleanbuild,build,compile,installbatch,setupbatch,pushbatchpatch,installweb,restartweb,restartcluster,stopcluster,startcluster,installcluster,cleanclusterlog,runadaptive,firecurationjob,fireindexjob,runhippo,cleanupjob,exportbreadcrumb,importclassification,deleteindex,healthcheck)",
                            required=True)
	parser.add_argument('-m','--machine', 
                            action="store", 
                            dest="machineList", 
                            help="If you want to specifically target a machine(s),"+
                            "then use this to key in the ip address", 
                            required=False)
	parser.add_argument('-f','--config-file', 
                            action="store", 
                            dest="configFilePath", 
                            help ="Provide the configuration file path,"+
                            "by default it is not required as it will be present along "+
                            "with the commandcenter module itself", 
                            required=False)
        parser.add_argument('-p','--project', 
                            action="store", 
                            dest="projectName", 
                            help="Provide a project name, currently supported projects(humingo)", 
                            required=True)
        parser.add_argument('-r','--release', 
                            action="store", 
                            dest="releaseBranch", 
                            help="Provide a branch name, system known branch name(master, indika)", 
                            required=False)
	parser.add_argument('--export-file',
			    action="store",
			    dest="exportFile",
			    help="specify the absolute path in which to store the exported content for a channel",
			    required=False)
	parser.add_argument('--channel',
			    action="store",
			    dest="channelName",
			    help="specifiy the name of the channel(Title case) obtained from channel table tobe exported, should be used along with --export-file option",
			    required=False)
	
        return parser

def main():
        parser = loadParsedArgs()
        inputConfig=parser.parse_args()
        configObj = initialize(inputConfig)
        logger.info("Initialized configuration object %s",configObj)
        build = Build(configObj)
        batch = InstallBatch(configObj)
        web = InstallWeb(configObj)
	nrt = InstallNrt(configObj)
	executeBatch = ExecuteBatch(configObj)

        if(configObj.commandName=='cleanbuild'):
                build.cleanBuild()
        elif(configObj.commandName=='build'):
                build.buildOnly()
        elif(configObj.commandName=='compile'):
                build.compileOnly()
        elif(configObj.commandName=='installbatch'):
                batch.installBatch()
        elif(configObj.commandName=='setupbatch'):
                batch.setupBatch()
	elif(configObj.commandName=='pushbatchpatch'):
		batch.pushPatch()
        elif(configObj.commandName=='installweb'):
                web.installWeb()
        elif(configObj.commandName=='restartweb'):
                web.restartWeb()
	elif(configObj.commandName=='restartcluster'):
		nrt.restartCluster()
	elif(configObj.commandName=='stopcluster'):
		nrt.stopCluster()
	elif(configObj.commandName=='startcluster'):
		nrt.startCluster()
	elif(configObj.commandName=='installcluster'):
		nrt.installCluster()
	elif(configObj.commandName=='runadaptive'):
		executeBatch.executeAdaptiveFullStock()
	elif(configObj.commandName=='pingcluster'):
		nrt.pingCluster()
	elif(configObj.commandName=='cleanclusterlog'):
		nrt.cleanClusterLog()
	elif(configObj.commandName=='firecurationjob'):
		isParsingOnly=False
		executeBatch.executeCuration(isParsingOnly)
	elif(configObj.commandName=='fireindexjob'):
		executeBatch.executeIndexing()
	elif(configObj.commandName=='runhippo'):
		executeBatch.executeHippo()
	elif(configObj.commandName=='cleanupjob'):
		logger.warn("Yet to implement")
	elif(configObj.commandName=='exportbreadcrumb'):
		isParsingOnly=True
		executeBatch.executeParseonly(isParsingOnly)
		#nodeltaExport=False;#We are not planning on supporting delta Export
		#channelName=configObj.getExportChannelName()
		#exportFile=configObj.getExportFileName()
		#executeBatch.exportBreadCrumb(channelName, exportFile, nodeltaExport)
	elif(configObj.commandName=='importclassification'):
		logger.warn("Yet to implement")
	elif(configObj.commandName=='deleteindex'):
		logger.warn("Yet to implement")
	elif(configObj.commandName=='healthcheck'):
		logger.warn("Yet to implement")
	                

#call the main method
main()
