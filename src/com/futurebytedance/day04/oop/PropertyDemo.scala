package com.futurebytedance.day04.oop

/**
 * @author yuhang.sun
 * @date 2021/2/16 - 3:28
 * @version 1.0
 * @Description
 * 属性是类的一个组成部分，一般是值数据类型,也可是引用类型。比如我们前面定义猫类 的 age  就是属性
 *
 * 1.注意事项和细节说明
 * 1)属性的定义语法同变量，示例：[访问修饰符] var 属性名称 [：类型] = 属性值
 * 2)属性的定义类型可以为任意类型，包含值类型[AnyVal]或引用类型[AnyRef]
 * 3)Scala中声明一个属性,必须显示的初始化，然后根据初始化数据的类型自动推断，属性类型可以省略(这点和Java不同)。[案例演示]
 * 4)如果赋值为null,则一定要加类型，因为不加类型, 那么该属性的类型就是Null类型.
 * 5)如果在定义属性时，暂时不赋值，也可以使用符号_(下划线)，让系统分配默认值.
 * 6)不同对象的属性是独立，互不影响，一个对象对属性的更改，不影响另外一个。//这点和java完全一样
 * 7)如果是用  _ 方式给默认值，则属性必须指定类型
 */
object PropertyDemo {
  def main(args: Array[String]): Unit = {
    val person = new Person
    println(person.Name) //Null
    println(person.address) //String类型

    println()

    val a = new A
    println(a.var1) // null 还是 ""
    println(a.var2) //0
    println(a.var3) // 0.0
    println(a.var4) //false

    //创建两个对象
    var worker1 = new Worker
    worker1.name = "jack"
    var worker2 = new Worker
    worker2.name = "tom"
  }
}


class Person {
  var age: Int = 10 //给属性赋值，省略类型，会自动推导
  var sal = 8090.9
  var Name = null //Name 是什么类型
  var address: String = null //ok
}

class A {
  var var1: String = _ //null
  var var2: Byte = _ //0
  var var3: Double = _ //0.0
  var var4: Boolean = _ //false
}

class Worker {
  var name: String = _
}