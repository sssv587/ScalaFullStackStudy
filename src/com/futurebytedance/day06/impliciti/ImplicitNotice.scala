package com.futurebytedance.day06.impliciti

/**
 * @author yuhang.sun
 * @date 2021/2/24 - 22:56
 * @version 1.0
 * @Description 隐式转换的前提
 */
class ImplicitNotice {
  def main(args: Array[String]): Unit = {
    //1.隐式转换不能有二义性
    //2.隐式转换不能嵌套使用
    implicit def f1(d: Double): Int = {
      d.toInt
      //val num2 : Int = 2.3 //底层 f1$1(2.3) f1$1对应的就是f1，就会形成递归
    }

    val num: Int = 1.1
    println("num=" + num)
  }
}
