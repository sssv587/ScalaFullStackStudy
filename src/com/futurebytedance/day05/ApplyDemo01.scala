package com.futurebytedance.day05

/**
 * @author yuhang.sun
 * @date 2021/2/21 - 19:30
 * @version 1.0
 * @Description 伴生对象-apply方法
 * 在伴生对象中定义apply方法，可以实现：类名(参数)方式来创建对象实例.
 */
object ApplyDemo01 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3)
    println(list)

    val pig1 = new Pig("小花")

    println("pig1.name=" + pig1.name)

    //使用apply方法创建对象
    val pig2 = Pig("小黑猪") //自定 def apply(pName: String)
    val pig3 = Pig() //自动触发 def apply()

    println("pig2.name=" + pig2.name) //小黑猪
    println("pig3.name=" + pig3.name) //匿名猪猪
  }
}

//案例演示apply方法
class Pig(pName: String) {
  var name: String = pName
}

object Pig {
  //编写一个apply
  def apply(pName: String): Pig = new Pig(pName)

  def apply(): Pig = new Pig("匿名猪猪")
}