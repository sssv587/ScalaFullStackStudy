package com.futurebytedance.day05.extendsi

/**
 * @author yuhang.sun
 * @date 2021/2/20 - 1:14
 * @version 1.0
 * @Description
 */
object ScalaFieldOverride {
  def main(args: Array[String]): Unit = {
    val obj1: AAA = new BBB
    val obj2: BBB = new BBB
    //obj1.age => obj1.age()//动态绑定机制
    //obj2.age => obj2.age()
    println("obj1.age=" + obj1.age + " obj2.age=" + obj2.age)
  }
}

class AAA {
  val age: Int = 10 //会生成 public age()
}

class BBB extends AAA {
  override val age: Int = 20 //会生成 public age()
}
