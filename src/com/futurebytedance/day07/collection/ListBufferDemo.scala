package com.futurebytedance.day07.collection

import scala.collection.mutable.ListBuffer

/**
 * @author yuhang.sun
 * @date 2021/2/28 - 16:41
 * @version 1.0
 * @Description ListBuffer的使用
 */
object ListBufferDemo {
  def main(args: Array[String]): Unit = {
    val lst0 = ListBuffer[Int](1, 2, 3)

    //如何访问
    println("lst0(2)=" + lst0(2))
    for (item <- lst0) {
      println("item=" + item)
    }

    //动态的增加元素，lst1就会变化，增加一个一个的元素
    val lst1 = new ListBuffer[Int] //空的ListBuffer
    lst1 += 4 // list1 (4)
    lst1.append(5) //lst1 (4,5)


    lst0 ++= lst1
    println("lst0=" + lst0) // lst0=ListBuffer(1, 2, 3, 4, 5)

    val lst2 = lst0 ++ lst1
    println("lst2=" + lst2) // lst2=ListBuffer(1, 2, 3, 4, 5, 4, 5)

    val lst3 = lst0 :+ 5
    println("lst3=" + lst3) // lst3=ListBuffer(1, 2, 3, 4, 5, 5)

    println("=====删除=======")
    println("lst1=" + lst1)
    lst1.remove(1)
    for (item <- lst1) {
      println("item=" + item)
    }
  }
}
