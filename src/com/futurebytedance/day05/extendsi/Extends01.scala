package com.futurebytedance.day05.extendsi

/**
 * @author yuhang.sun
 * @date 2021/2/18 - 23:54
 * @version 1.0
 * @Description
 */
object Extends01 {
  def main(args: Array[String]): Unit = {
    //使用
    val student = new Student
    student.name = "jack" //调用了student.name()
    student.studying()
    student.showInfo()
  }
}

class Person {
  var name: String = _
  var age: Int = _

  def showInfo(): Unit = {
    println("学生信息如下：")
    println("名字：" + this.name)
  }
}

//Student继承了Person类
class Student extends Person {
  def studying(): Unit = {
    //这里可以使用父类的属性
    println(this.name + "学习 scala中....")
  }
}
