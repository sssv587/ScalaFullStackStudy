package com.futurebytedance.day01.vars

/**
 * @author yuhang.sun
 * @date 2021/2/9 - 2:14
 * @version 1.0
 * @Description 变量的基本使用
 */
object VarDemo01 {
  def main(args: Array[String]): Unit = {
    //编译器，动态的(逃逸分析)
    val age: Int = 10
    val sal: Double = 10.9
    val name: String = "Tom"
    val isPass: Boolean = false
    //在scala中，小数默认为Double，整数默认为Int
    val score: Float = 70.9f
    println(s"${age} ${isPass} ${name} ${sal}")
  }
}
