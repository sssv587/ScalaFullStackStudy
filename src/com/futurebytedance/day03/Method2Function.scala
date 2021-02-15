package com.futurebytedance.day03

/**
 * @author yuhang.sun
 * @date 2021/2/15 - 21:46
 * @version 1.0
 * @Description
 */
object Method2Function {
  def main(args: Array[String]): Unit = {
    //使用方法
    //先创建一个对象
    val dog = new Dog
    println(dog.sum(10, 20))

    //方法转成函数
    val f1 = dog.sum _
    println("f1=" + f1)
    println("f1=" + f1(50, 60))

    //函数，求两个数的和
    val f2 = (n1: Int, n2: Int) => {
      //函数体
      n1 + n2
    }
    println("f2=" + f2)
    println("f2=" + f2(5, 6))
  }
}

class Dog {
  //方法
  def sum(n1: Int, n2: Int): Int = {
    n1 + n2
  }
}