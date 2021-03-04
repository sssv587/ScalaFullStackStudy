package com.futurebytedance.day09.caseclass

/**
 * @author yuhang.sun
 * @date 2021/3/4 - 21:54
 * @version 1.0
 * @Description 样例类 - 模式匹配、copy方法
 *
 * 1)样例类仍然是类
 * 2)样例类用case关键字进行声明。
 * 3)样例类是为模式匹配(对象)而优化的类
 * 4)构造器中的每一个参数都成为val——除非它被显式地声明为var
 * 5)在样例类对应的伴生对象中提供apply方法让你不用new关键字就能构造出相应的对象
 * 6)提供unapply方法让模式匹配可以工作
 * 7)将自动生成toString、equals、hashCode和copy方法(有点类似模板类，直接给生成，供程序员使用)
 * 8)除上述外，样例类和其他类完全一样。你可以添加方法和字段，扩展它们
 *
 */
object CaseClassDemo01 {
  def main(args: Array[String]): Unit = {
    //使用样例类的方式进行对象匹配的简洁性
    for (amt <- Array(Dollar(1000.0), Currency(1000.0, "RMB"), NoAmount)) {
      val result = amt match {
        case Dollar(v) => "$" + v //$1000.0
        case Currency(v, u) => v + " " + u //1000.0 RMB
        case NoAmount => "" // ""
      }
      println(amt + ": " + result)
    }

    //样例类的copy方法和带名参数
    val amt = Currency(29.95, "RMB")

    val amt1 = amt.copy() //克隆，创建的对象和amt的属性一样
    val amt2 = amt.copy(value = 19.95)
    val amt3 = amt.copy(unit = "英镑")

    println(amt)
    println(amt1)
    println(amt2)
    println(amt3)

  }
}

abstract class Amount

case class Dollar(value: Double) extends Amount

case class Currency(value: Double, unit: String) extends Amount

case object NoAmount extends Amount

