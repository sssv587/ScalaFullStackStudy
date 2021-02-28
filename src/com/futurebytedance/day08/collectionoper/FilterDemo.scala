package com.futurebytedance.day08.collectionoper

/**
 * @author yuhang.sun
 * @date 2021/3/1 - 0:23
 * @version 1.0
 * @Description filter操作
 */
object FilterDemo {
  def main(args: Array[String]): Unit = {
    val names = List("Alice", "Bob", "Nick")
    val names2 = names.filter(startA)
    println("names=" + names)
    println("names2=" + names2)
  }

  def startA(s: String): Boolean = {
    s.startsWith("A")
  }
}
