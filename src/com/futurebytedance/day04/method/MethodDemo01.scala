package com.futurebytedance.day04.method

/**
 * @author yuhang.sun
 * @date 2021/2/17 - 0:50
 * @version 1.0
 * @Description
 * 1.方法的调用机制原理
 * 提示：程序调用方法过程+说明
 * 1)  当我们scala开始执行时，先在栈区开辟一个main栈。
 * 2)  当scala程序在执行到一个方法时，总会创建一个新的栈桢。
 * 3)  每个栈桢是独立的空间，变量（基本数据类型）是独立的，相互不影响（引用类型除外）
 * 4)  当方法执行完毕后，该方法开辟的栈桢就会出栈。
 *
 */
object MethodDemo01 {
  def main(args: Array[String]): Unit = {
    //使用一把
    val dog = new Dog
    val res = dog.cal(10, 20)
    println(res)
  }
}

class Dog {
  var sal: Double = _
  var food: String = _

  //方法
  def cal(n1: Int, n2: Int): Int = {
    n1 + n2
  }
}
