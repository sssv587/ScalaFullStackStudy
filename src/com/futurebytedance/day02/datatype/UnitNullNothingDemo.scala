package com.futurebytedance.day02.datatype

/**
 * @author yuhang.sun
 * @date 2021/2/13 - 23:47
 * @version 1.0
 * @Description
 */
object UnitNullNothingDemo {
  def main(args: Array[String]): Unit = {
    val res: Unit = sayHello()
    println("res=" + res)

    //Null 类只有一个实例对象，null，类似于 Java 中的 null 引用。null 可以赋值给任意引用类型(AnyRef)，但是
    //不能赋值给值类型(AnyVal: 比如 Int, Float, Char, Boolean, Long, Double, Byte, Short)
    val dog: Dog = null
    //val char1 : Char = null//错误
    println("ok~~~")
  }

  //Unit等价于java的void，只有一个实例值()
  def sayHello(): Unit = {

  }
}

class Dog {

}
