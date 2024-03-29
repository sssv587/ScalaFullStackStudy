package com.futurebytedance.day04.constructor

/**
 * @author yuhang.sun
 * @date 2021/2/17 - 1:39
 * @version 1.0
 * @Description
 */
object ConDemo03 {
  def main(args: Array[String]): Unit = {
    val p1 = new Person1("scott")
    p1.showInfo()
  }
}

//定义了一个Person类
//Person 有几个构造器 4个
class Person1 private() {
  var name: String = _
  var age: Int = _

  def this(name: String) {
    //辅助构造器无论是直接或间接，最终都一定要调用主构造器，执行主构造器的逻辑
    //而且需要放在辅助构造器的第一行[这点和java一样，java中一个构造器要调用同类的其它构造器，也需要放在第一行]
    this() //直接调用主构造器
    this.name = name
  }

  //辅助构造器
  private def this(name: String, age: Int) {
    this() //直接调用主构造器
    this.name = name
    this.age = age
  }

  def this(age: Int) {
    this("匿名") //间接调用主构造器,因为 def this(name : String) 中调用了主构造器!
    this.age = age
  }

  def showInfo(): Unit = {
    println("person信息如下:")
    println("name=" + this.name)
    println("age=" + this.age)
  }
}
