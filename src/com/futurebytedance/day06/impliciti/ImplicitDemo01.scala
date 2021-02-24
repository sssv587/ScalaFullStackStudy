package com.futurebytedance.day06.impliciti

/**
 * @author yuhang.sun
 * @date 2021/2/24 - 21:57
 * @version 1.0
 * @Description 隐式转换
 * 1.隐式转换函数
 * 隐式转换函数是以implicit关键字声明的带有单个参数的函数。这种函数将会自动应用，将值从一种类型转换为另一种类型
 *
 * 2.隐式转换的注意事项和细节
 * 1)隐式转换函数的函数名可以是任意的，隐式转换与函数名称无关，只与函数签名（函数参数类型和返回值类型）有关。
 * 2)隐式函数可以有多个(即：隐式函数列表)，但是需要保证在当前环境下，只有一个隐式函数能被识别
 */
object ImplicitDemo01 {
  def main(args: Array[String]): Unit = {
    //编写一个隐式函数转成Double->Int转换
    //隐式函数应当在作用域才能生效
    implicit def f1(d: Double): Int = { //底层 生成f1$1
      d.toInt
    }

    implicit def f2(d: Float): Int = {
      d.toInt
    }

    //这里我们必须保证隐式函数的匹配只能是唯一的.
    //    implicit def f3(d: Float): Int = {
    //      d.toInt
    //    }

    val num: Int = 3.5 // 底层编译 f1$1(3.5)
    println("num=" + num)

    val num1: Int = 4.5f

  }
}
