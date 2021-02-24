package com.futurebytedance.day07.collection

/**
 * @author yuhang.sun
 * @date 2021/2/25 - 0:26
 * @version 1.0
 * @Description
 */
object CollectionDemo01 {
  def main(args: Array[String]): Unit = {
    val str = "hello" //字符串在scala就是Char集合 IndexSeq
    for (item <- str) {
      println(item)
    }
    println("str=" + str)
  }
}
