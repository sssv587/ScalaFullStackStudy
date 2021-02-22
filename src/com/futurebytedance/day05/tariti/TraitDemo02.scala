package com.futurebytedance.day05.tariti

/**
 * @author yuhang.sun
 * @date 2021/2/21 - 20:00
 * @version 1.0
 * @Description
 */
object TraitDemo02 {
  def main(args: Array[String]): Unit = {
    val c = new C
    val f = new F
    c.getConnect()
    f.getConnect()
  }
}

//按照要求定义一个trait
trait Trait1 {
  //定义一个规范
  def getConnect()
}

//先将六个类的关系写出
class A {}

class B extends A {}

class C extends A with Trait1 {
  override def getConnect(): Unit = {
    println("连接Mysql数据库...")
  }
}

class D {}

class E extends D {}

class F extends D with Trait1 {
  override def getConnect(): Unit = {
    println("连接Oracle数据库...")
  }
}
