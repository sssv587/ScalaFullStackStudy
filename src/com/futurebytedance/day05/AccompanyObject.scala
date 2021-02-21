package com.futurebytedance.day05

/**
 * @author yuhang.sun
 * @date 2021/2/21 - 18:16
 * @version 1.0
 * @Description 伴生类和伴生对象
 * 1)Scala中伴生对象采用object关键字声明，伴生对象中声明的全是"静态"内容，可以通过伴生对象名称直接调用。
 * 2)伴生对象对应的类称之为伴生类，伴生对象的名称应该和伴生类名一致。
 * 3)伴生对象中的属性和方法都可以通过伴生对象名直接调用访问
 * 4)从语法角度来讲，所谓的伴生对象其实就是类的静态方法和静态变量的集合
 * 5)从技术角度来讲，scala还是没有生成静态的内容，只不过是将伴生对象生成了一个新的类，实现属性和方法的调用。
 * 6)从底层原理看，伴生对象实现静态特性是依赖于 public static final MODULE$ 实现的。
 * 7)伴生对象的声明应该和伴生类的声明在同一个源码文件中(如果不在同一个文件中会运行错误!)，但是如果没有伴生类，也就没有所谓的伴生对象了，所以放在哪里就无所谓了。
 * 8)如果 class A 独立存在，那么A就是一个类， 如果 object A 独立存在，那么A就是一个"静态"性质的对象[即类对象], 在 object A中声明的属性和方法可以通过 A.属性 和 A.方法 来实现调用
 * 9)当一个文件中，存在伴生类和伴生对象时，文件的图标会发生变化
 *
 */
object AccompanyObject {
  def main(args: Array[String]): Unit = {
    println(ScalaPerson.sex) //true 在底层等价于 ScalaPerson$.$MODULE.sayHi()
    ScalaPerson.sayHi()
  }
}

//说明
//1.当在同一个文件中，有class ScalaPerson和object ScalaPerson
//2.class ScalaPerson称为伴生类，将非静态的内容写到该类中
//3.object ScalaPerson称为伴生对象，将静态的内容写入到该对象(类)
//4.class ScalaPerson 编译后底层生成 ScalaPerson类 ScalaPerson.class
//5.object ScalaPerson 编译后底层生成 ScalaPerson$类 ScalaPerson$.class
//6.对于伴生对象的内容，我们可以直接通过ScalaPerson.属性 或者方法

//伴生类
class ScalaPerson {
  var name: String = _
}

//伴生对象
object ScalaPerson {
  var sex: Boolean = true

  def sayHi(): Unit = {
    println("object scalaPerson sayHi")
  }
}
