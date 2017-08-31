package org.etl.server

import org.etl.SparrowStandaloneSetup
import org.restlet.Application
import com.typesafe.scalalogging.LazyLogging
import org.restlet.Component
import org.restlet.data.Protocol
import org.restlet.routing.Router


object SparrowServer extends Application with LazyLogging{
  def main(args:Array[String]){
    
    logger.info("Starting the restlet server to take in commands")
    val component = new Component()
    component.getServers().add(Protocol.HTTP, 8080)
    // Attach the sample application.
    component.getDefaultHost().attach(this)
    // Start the component.
    component.start()
    
  }
  override def createInboundRoot: Router = {
    val router = new Router(getContext())
    router.attach("/process/{processname}/start",classOf[StartProcess])
    router.attach("/",classOf[ListProcess])
    router.attach("/process/{processname}/{id}/stop", classOf[StopProcess])
    router
}
}