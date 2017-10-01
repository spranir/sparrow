package org.etl.command
import java.lang.reflect.{ Method, InvocationHandler, Proxy }
import org.eclipse.emf.ecore.util.EDataTypeEList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.BasicEList
import org.etl.util.ParameterisationEngine
import org.etl.sparrow.RestPart
import org.eclipse.emf.ecore.util.EObjectContainmentEList
import com.typesafe.scalalogging.LazyLogging

object CommandProxy extends LazyLogging{
  //val eList = classOf[EList[String]].getName
  def createProxy[I](proxee: I, interfaceClass: Class[I], context: Context): I = {

    assert(interfaceClass.isInterface, "interfaceClass should be an inteface class")
    Proxy.newProxyInstance(interfaceClass.getClassLoader, Array(interfaceClass), new InvocationHandler() {
      override def invoke(proxy: Object, method: Method, args: Array[Object]) = {

        method.getReturnType.getName match {

          case "org.eclipse.emf.common.util.EList" => {
            method.getName match {
              case "getParts" => {
                logger.info("Invoking method in  action #{}",method.getName)
                method.invoke(proxee, args: _*)
                  .asInstanceOf[EObjectContainmentEList[RestPart]]
              }
              case _ => {
                val interim = method.invoke(proxee, args: _*)
                  .asInstanceOf[EDataTypeEList[String]]
                logger.info("Invoking method in  action #{}",method.getName)
                val output = new BasicEList[String]
                val iter = interim.iterator
                while (iter.hasNext) {
                  val value = iter.next
                  val result = ParameterisationEngine.resolve(value, context)
                  output.add(result)
                }
                output
              }
            }
          }
          case _ => {
            val inputString = method.invoke(proxee, args: _*).asInstanceOf[String]
            val result = ParameterisationEngine.resolve(inputString, context)
            result
          }

        }

      }
    }).asInstanceOf[I]
  }

}