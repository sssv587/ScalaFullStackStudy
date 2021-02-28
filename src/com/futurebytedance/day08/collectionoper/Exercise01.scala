package com.futurebytedance.day08.collectionoper

/**
 * @author yuhang.sun
 * @date 2021/2/28 - 23:58
 * @version 1.0
 * @Description map练习
 */
object Exercise01 {
  def main(args: Array[String]): Unit = {
    val names = List("Alice", "Bob", "Nick")
    val names2 = names.map(upper)
    println("names2=" + names2)
  }

  def upper(s: String): String = {
    s.toUpperCase()
  }
}
