package org.etl.server

object PathResolver {
  
  def resolvePath(processName:String, config:Map[String, String]):String={
    val fileRelativePath = config.get("filepath");
    val processStoreBasePath = config.get("basepath");
    val finalPath = this.getClass.getClassLoader.getResource(processStoreBasePath+System.getProperty("file.separator")+fileRelativePath).getPath
    finalPath
  }
}