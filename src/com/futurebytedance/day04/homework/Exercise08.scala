package com.futurebytedance.day04.homework

/**
 * @author yuhang.sun
 * @date 2021/2/17 - 0:39
 * @version 1.0
 * @Description
 */
object Exercise08 {
  def main(args: Array[String]): Unit = {
    val str = "Hello"
    val subStr1 = str.take(1)
    println(subStr1) // "H"

    var subStr2 = str.drop(1)
    println(subStr2) //"ello"
  }
}
