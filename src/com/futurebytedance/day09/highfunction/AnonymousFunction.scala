package com.futurebytedance.day09.highfunction

/**
 * @author yuhang.sun
 * @date 2021/3/5 - 0:40
 * @version 1.0
 * @Description 匿名函数
 */
object AnonymousFunction {
  def main(args: Array[String]): Unit = {
    //对匿名函数的一个说明
    //1.不需要写def 函数名
    //2.不需要写返回类型，使用类型推导
    //3.= 变成 =>
    //4.如果有多行，则使用{}包裹
    val triple = (x: Double) => {
      println("x=" + x)
      3 * x
    }
    println("triple=" + triple(3)) //9.0
  }
}
