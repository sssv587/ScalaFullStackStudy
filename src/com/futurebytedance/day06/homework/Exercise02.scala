package com.futurebytedance.day06.homework

/**
 * @author yuhang.sun
 * @date 2021/2/21 - 0:28
 * @version 1.0
 * @Description
 */
object Exercise02 {
  def main(args: Array[String]): Unit = {
    val point = Point(3, 4) //触发apply
    println(point)
  }
}

//class Point(x: Int = 0, y: Int = 0) extends java.awt.Point(x, y)
class Point(x: Int = 0, y: Int = 0) { //Point类
  var x1: Int = x //属性
  var y1: Int = y //属性
}

object Point {
  def apply(x: Int = 0, y: Int = 0) = new Point(x, y)
}