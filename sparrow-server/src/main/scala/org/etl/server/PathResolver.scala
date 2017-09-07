package org.etl.server

object PathResolver {
  
  def resolvePath(processName:String, config:Map[String, String]):String={
    val fileRelativePath = config.get("filepath").get;
    println("filepath="+fileRelativePath)
    val processStoreBasePath = config.get("basepath").get;
    println("basepath="+processStoreBasePath)
    val fullPath = new StringBuilder().append(processStoreBasePath).
    append("/").append(fileRelativePath).toString()
    println("fullpath="+fullPath)
    val finalPath = this.getClass.getClassLoader.getResource(fullPath).getPath
    finalPath
  }
}