package com.futurebytedance.day08.matchi

/**
 * @author yuhang.sun
 * @date 2021/3/2 - 23:54
 * @version 1.0
 * @Description 模式匹配-匹配数组
 */
object MatchArray {
  def main(args: Array[String]): Unit = {
    for (arr <- Array(Array(0), Array(1, 0), Array(0, 1, 0),
      Array(1, 1, 0), Array(1, 1, 0, 1))) {
      /*
      Array(0) 匹配只有一个元素且为0的数组。
      Array(x,y) 匹配数组有两个元素，并将两个元素赋值为x和y。当然可以依次类推Array(x,y,z) 匹配数组有3个元素的等等....
      Array(0,_*) 匹配数组以0开始
       */
      val result = arr match {
        case Array(0) => "0"
        case Array(x, y) => x + "=" + y
        case Array(0, _*) => "以0开头和数组"
        case _ => "什么集合都不是"
      }
      println("result = " + result)
    }

    //给你一个数组 Array(10,20),请使用模式匹配，返回Array(20,10)
    val array = Array(10, 20)
    val obj = array match {
      case Array(x,y) => Array(y,x)
      case _ => println("错误")
    }
    println(obj.asInstanceOf[Array[Int]].mkString(","))
  }
}
