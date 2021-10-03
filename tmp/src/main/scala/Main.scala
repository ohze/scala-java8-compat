import scala.compat.java8.FunctionConverters._
import java.util.function.IntFunction

object Main {
  def invoke(jfun: IntFunction[String]): String = jfun(2)
  def main(args: Array[String]): Unit = {
    val fun = (i: Int) => s"ret: $i"
    val ret = invoke(fun.asJava)
    println(ret)
  }
}
