package com.futurebytedance.day02.dataconvert

/**
 * @author yuhang.sun
 * @date 2021/2/14 - 0:28
 * @version 1.0
 * @Description
 */
object Demo02 {
  def main(args: Array[String]): Unit = {
    val num1: Int = 10 * 3.5.toInt + 6 * 1.5.toInt
    val num2: Int = (10 * 3.5 + 6 * 1.5).toInt
    println(num1 + "\t" + num2)
  }
}
