package com.futurebytedance.day04.dogcase

/**
 * @author yuhang.sun
 * @date 2021/2/17 - 1:01
 * @version 1.0
 * @Description
 */
object DogCaseTest {
  def main(args: Array[String]): Unit = {
    /*
    编写一个 Dog 类，包含 name(String)、age(Int)、weight(Double)属性
    类中声明一个 say 方法，返回 String 类型，方法返回信息中包含所有属性值。
    在另一个 TestDog 类中的 main 方法中，创建 Dog 对象，并访问 say 方法和所有
    属性，将调用结果打印输出。
     */
    val dog = new Dog
    dog.name = "tomcat"
    dog.age = 2
    dog.weight = 6
    println(dog.say())
  }
}

class Dog {
  var name: String = _
  var age: Int = _
  var weight: Double = _

  def say(): String = {
    s"小狗的信息如下\t ${name} \t ${age} \t ${weight}"
  }
}
