package com.futurebytedance.day02.datatype

/**
 * @author yuhang.sun
 * @date 2021/2/13 - 23:31
 * @version 1.0
 * @Description
 */
object TypeDemo03 {
  def main(args: Array[String]): Unit = {
    println("long的最大值" + Long.MaxValue + "~" + Long.MinValue)

    var i = 10 //i Int
    var j = 10L //j Long

    val num1: Float = 2.2345678912f
    val num2: Double = 2.2345678912
    println("num1=" + num1 + "\tnum2=" + num2)
  }
}
