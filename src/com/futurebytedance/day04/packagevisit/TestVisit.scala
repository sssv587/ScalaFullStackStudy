package com.futurebytedance.day04.packagevisit

/**
 * @author yuhang.sun
 * @date 2021/2/18 - 0:44
 * @version 1.0
 * @Description Scala中包的可见性和访问修饰符的使用
 *
 *  1)当属性访问权限为默认时，从底层看属性是private的，但是因为提供了xxx_$eq()[类似setter]/xxx()[类似getter] 方法，因此从使用效果看是任何地方都可以访问)
 *  2)当方法访问权限为默认时，默认为public访问权限
 *  3)private为私有权限，只在类的内部和伴生对象中可用
 *  4)protected为受保护权限，scala中受保护权限比Java中更严格，只能子类访问，同包无法访问
 *  5)在scala中没有public关键字,即不能用public显式的修饰属性和方法。
 *  6)包访问权限（表示属性有了限制。同时包也有了限制），这点和Java不一样，体现出Scala包使用的灵活性
 *
 *  scala设计者将访问的方式分成三大类
 *  (1) 处处可以访问 public
 *  (2) 子类和伴生对象能访问 protected
 *  (3) 本类和伴生对象访问 private
 */
object TestVisit {
  def main(args: Array[String]): Unit = {
    val c = new Clerk()
    c.showInfo()
    Clerk.test(c)

    //创建一个Person对象
    val p1 = new Person
    println(p1.name)
  }
}

//类
class Clerk {
  var name: String = "jack"
  private var sal: Double = 9999.9
  protected var age = 10
  var job:String = "大数据工程师"

  def showInfo(): Unit = {
    //在本类可以使用私有的
    println(" name " + name + " sal= " + sal)
  }
}

//当一个文件中出现了class Clerk 和 object Clerk
//1.class Clerk 称为伴生类
//2.object Clerk 称为伴生对象
//3.因为scala设计者将static拿掉，他就设计了 伴生类和伴生对象的概念
//4.伴生类 写非静态的内容 伴生对象 写静态的内容
object Clerk {
  def test(c: Clerk): Unit = {
    //这里体现出在伴生对象中，可以访问c.sal
    c.sal = 10.9
    println("test() name=" + c.name + " sal= " + c.sal)
  }
}

class Person{
  //这里我们增加一个包访问权限
  //下面private[packagevisit] 1.仍然是private 2.在packagevisit包(包括子包)下也可以使用name，相当于扩大访问范围
  private[packagevisit] val name = "jack"
}