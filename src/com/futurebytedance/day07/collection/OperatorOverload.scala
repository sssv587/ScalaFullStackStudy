package com.futurebytedance.day07.collection

/**
 * @author yuhang.sun
 * @date 2021/2/28 - 17:10
 * @version 1.0
 * @Description 操作符的重载
 */
object OperatorOverload {
  def main(args: Array[String]): Unit = {
    val cat = new Cat
    cat + 10
    cat + 20
    cat.+(9)
    println("cat.age=" + cat.age)
  }
}

class Cat {
  var age = 0

  def +(n: Int): Unit = {
    this.age += n
  }
}
