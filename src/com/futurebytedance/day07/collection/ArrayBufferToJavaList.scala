package com.futurebytedance.day07.collection

import scala.collection.mutable.ArrayBuffer

/**
 * @author yuhang.sun
 * @date 2021/2/28 - 15:26
 * @version 1.0
 * @Description Scala数组转Java的List
 */
object ArrayBufferToJavaList {
  def main(args: Array[String]): Unit = {
    // Scala集合和Java集合互相转换
    val arr = ArrayBuffer("1", "2", "3")

    /*
    implicit def bufferAsJavaList[A](b: mutable.Buffer[A]): ju.List[A] = b match {
    case JListWrapper(wrapped) => wrapped
    case _ => new MutableBufferWrapper(b)
  }
     */
    import scala.collection.JavaConversions.bufferAsJavaList
    //对象 ProcessBuilder，因为这里使用到上面的 bufferAsJavaList
    val javaArr = new ProcessBuilder(arr) // 为什么可以这样使用？
    //这里arrList就是java中的List
    val arrList = javaArr.command()

    println(arrList) //输出 [1,2,3]

    //java的List转成scala的ArrayBuffer
    //说明:
    //1.asScalaBuffer是一个隐式函数
    /*
    implicit def asScalaBuffer[A](l: ju.List[A]): mutable.Buffer[A] = l match {
    case MutableBufferWrapper(wrapped) => wrapped
    case _ =>new JListWrapper(l)
  }
     */
    import scala.collection.JavaConversions.asScalaBuffer
    import scala.collection.mutable

    // java.util.List ==> Buffer
    val scalaArr: mutable.Buffer[String] = arrList

    scalaArr.append("jack")
    println(scalaArr) // ArrayBuffer(1, 2, 3, jack)

  }
}
