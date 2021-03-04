package com.futurebytedance.day09.highfunction

/**
 * @author yuhang.sun
 * @date 2021/3/5 - 0:09
 * @version 1.0
 * @Description 作为函数的参数
 */
object FunctionParameter {
  def main(args: Array[String]): Unit = {
    def plus(x: Int) = 3 + x

    val result1 = Array(1, 2, 3, 4).map(plus(_))
    println(result1.mkString(","))

    //说明
    //1.在scala中，函数也是有类型的，比如plus就是<function1>
    println("plus的函数类型" + plus _)
  }
}
