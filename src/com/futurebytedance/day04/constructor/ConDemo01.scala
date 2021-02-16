package com.futurebytedance.day04.constructor

/**
 * @author yuhang.sun
 * @date 2021/2/17 - 1:16
 * @version 1.0
 * @Description 构造器
 * 1.Scala构造器的介绍
 * 1)和Java一样，Scala构造对象也需要调用构造方法，并且可以有任意多个构造方法（即scala中构造器也支持重载）。
 * Scala类的构造器包括： 主构造器（一个） 和 辅助构造器(多个)
 *
 * 2.Scala构造器的基本语法
 * class 类名(形参列表) {  // 主构造器
 * // 类体
 * def  this(形参列表) {  // 辅助构造器
 * }
 * def  this(形参列表) {  //辅助构造器可以有多个...
 * }
 * }
 * 辅助构造器 函数的名称this, 可以有多个，编译器通过不同参数（个数或类型）来区分.
 *
 * 3.Scala构造器注意事项和细节
 * 1)Scala构造器作用是完成对新对象的初始化，构造器没有返回值。
 * 2)主构造器的声明直接放置于类名之后
 * 3)主构造器会执行类定义中的所有语句（把类中写的语句放入到主构造器），这里可以体会到Scala的函数式编程和面向对象编程融合在一起，即：构造器也是方法（函数），传递参数和使用方法和前面的函数部分内容没有区别
 * 4)如果主构造器无参数，小括号可省略，构建对象时调用的构造方法的小括号也可以省略
 * 5)辅助构造器名称为this（这个和Java是不一样的），多个辅助构造器通过不同参数列表进行区分， 在底层就是构造器重载。
 * 6)如果想让主构造器变成私有的，可以在()之前加上private，这样用户不能直接通过主构造器来构造对象了
 * 7)辅助构造器的声明不能和主构造器的声明一致,会发生错误(即构造器名重复)
 */
object ConDemo01 {
  def main(args: Array[String]): Unit = {
    val p1 = new Person("jack", 20)
    println(p1)

    val a = new A
    val a2 = new A()

    //下面这句话就会调用辅助构造器def this(name:String)
    val p2 = new Person("tom")
    println(p2)
  }
}

//构造器的快速入门
//创建Person对象的同时初始化对象的age属性值和name属性值
class Person(inName: String, inAge: Int) {
  var name: String = inName
  var age: Int = inAge
  age += 10
  println("~~~~~~")

  //重写了toString，便于输出对象的信息
  override def toString: String = {
    "name=" + this.name + " age=" + this.age
  }

  println("ok~~~~")
  println("age=" + age)

  def this(name: String) {
    //辅助构造器，必须在第一行显式调用主构造器(可以是直接，也可以是间接)
    this("jack", 20)
    this.name = name //重新赋值
  }
}

class A() {

}