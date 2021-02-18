package com.futurebytedance.day05.extendsi

/**
 * @author yuhang.sun
 * @date 2021/2/19 - 0:42
 * @version 1.0
 * @Description 重写方法(方法覆盖)
 * scala明确规定，重写一个非抽象方法需要用override关键字修饰，调用超类的方法使用super关键字
 */
object MethodOverride01 {
  def main(args: Array[String]): Unit = {
    val emp = new Emp
    emp.printName()
  }
}


class Person1 {
  var name: String = "tom"

  def printName() {
    println("Person printName() " + name)
  }

  def sayHi(): Unit = {
    println("sayHi")
  }
}

class Emp extends Person1 {
  override def printName() {
    println("Emp printName() " + name)
    //在子类中需要去调用父类的方法，使用super
    super.printName()
    sayHi()
  }
}
