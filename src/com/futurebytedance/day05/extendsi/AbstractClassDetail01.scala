package com.futurebytedance.day05.extendsi

/**
 * @author yuhang.sun
 * @date 2021/2/20 - 23:57
 * @version 1.0
 * @Description Scala抽象类使用的注意事项和细节讨论
 * 1)抽象类不能被实例化
 * 2)抽象类不一定要包含abstract方法。也就是说,抽象类可以没有abstract方法
 * 3)一旦类包含了抽象方法或者抽象属性,则这个类必须声明为abstract
 * 4)抽象方法不能有主体，不允许使用abstract修饰。
 * 5)如果一个类继承了抽象类，则它必须实现抽象类的所有抽象方法和抽象属性，除非它自己也声明为abstract类。
 * 6)抽象方法和抽象属性不能使用private、final 来修饰，因为这些关键字都是和重写/实现相违背的。
 * 7)抽象类中可以有实现的方法.
 * 8)子类重写抽象方法不需要override，写上也不会错(另一种叫法是实现).
 */
object AbstractClassDetail01 {
  def main(args: Array[String]): Unit = {
    val c = new C
    println(c.name)

    //默认情况下，一个抽象类是不能实例化的，但是你实例化时动态的实现了抽象类的所有抽象方法也可以
    val animal = new Animal03 {
      override def sayHello(): Unit = {
        println("say hello~")
      }

      override var food: String = _
    }
    animal.sayHello()
  }
}

abstract class Animal02 {
  val name: Int

  //在抽象类中可以有实现的方法
  def sayHi(): Unit = {
    println("xxx")
  }
}

abstract class Animal03 {
  def sayHello()

  var food: String
}

class Cat extends Animal03{
  override def sayHello(): Unit = {
    println("小狗汪汪叫!")
  }

  override var food: String = _
}

class C extends Animal02 {
  override val name: Int = 1
}