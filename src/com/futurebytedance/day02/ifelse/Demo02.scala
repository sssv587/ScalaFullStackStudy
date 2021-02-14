package com.futurebytedance.day02.ifelse

/**
 * @author yuhang.sun
 * @date 2021/2/15 - 0:21
 * @version 1.0
 * @Description 双分支
 */
object Demo02 {
  def main(args: Array[String]): Unit = {
    val age = 6
    if (age > 18) {
      println("age>18")
    } else {
      println("age<=18")
    }
  }
}
