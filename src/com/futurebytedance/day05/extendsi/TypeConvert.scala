package com.futurebytedance.day05.extendsi

/**
 * @author yuhang.sun
 * @date 2021/2/19 - 0:48
 * @version 1.0
 * @Description Scala中类型检查和转换
 * 要测试某个对象是否属于某个给定的类，可以用isInstanceOf方法。用asInstanceOf方法将引用转换为子类的引用。classOf获取对象的类名。
 *
 * 1)classOf[String]就如同Java的 String.class 。
 * 2)obj.isInstanceOf[T]就如同Java的obj instanceof T 判断obj是不是T类型。
 * 3)obj.asInstanceOf[T]就如同Java的(T)obj 将obj强转成T类型。
 */
object TypeConvert {
  def main(args: Array[String]): Unit = {
    //classOf的使用，可以得到类名
    println(classOf[String]) //输出

    val s = "king"
    println(s.getClass.getName) //使用反射机制

    //isInstanceOf,asInstanceOf
    var p1 = new Person100
    val emp = new Emp100
    //将子类引用给父类（向上转换,自动）
    p1 = emp
    //将父类引用重新转成子类引用(多态),即向下转型
    val emp2 = p1.asInstanceOf[Emp100]
    emp2.sayHello()

  }
}

class Person100 {
  var name: String = "tom"

  def printName() {
    println("Person printName() " + name)
  }

  def sayHi(): Unit = {
    println("sayHi")
  }
}

class Emp100 extends Person100 {
  override def printName() {
    println("Emp printName() " + name)
    //在子类中需要去调用父类的方法，使用super
    super.printName()
    sayHi()
  }

  def sayHello(): Unit = {
    println("sayHello~~~")
  }
}