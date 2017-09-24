package org.etl.command
import java.lang.reflect.{ Method, InvocationHandler, Proxy }
import org.eclipse.emf.ecore.util.EDataTypeEList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.BasicEList


object CommandProxy {
  //val eList = classOf[EList[String]].getName
  def createProxy[I](proxee: I, interfaceClass: Class[I], context: Context): I = {

    assert(interfaceClass.isInterface, "interfaceClass should be an inteface class")
    Proxy.newProxyInstance(interfaceClass.getClassLoader, Array(interfaceClass), new InvocationHandler() {
      override def invoke(proxy: Object, method: Method, args: Array[Object]) = {
        
        method.getReturnType.getName match {
          case "org.eclipse.emf.common.util.EList"=> {
            val interim = method.invoke(proxee, args: _*)
              .asInstanceOf[EDataTypeEList[String]]
            val output = new BasicEList[String]
            val iter = interim.iterator            
            while (iter.hasNext) {
              val value = iter.next              
              output.add(context.getValue(value))
            }
            output
          }
          case _ => {
            val result = context.getValue(
              method.invoke(proxee, args: _*).asInstanceOf[String])

            result
          }

        }

      }
    }).asInstanceOf[I]
  }

}