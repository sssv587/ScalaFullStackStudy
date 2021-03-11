package com.futurebytedance.day11.homework

import scala.math.sqrt

/**
 * @author yuhang.sun
 * @date 2021/3/11 - 22:01
 * @version 1.0
 * @Description
 */
object Exercise04 {
  def main(args: Array[String]): Unit = {
    val h = compose(f, g)
    println(h(2)) //1
    println(h(1) + "  " + h(0)) //None和None
  }

  /*
  编写一个compose函数，将两个类型为Double=>Option[Double]的函数组合在一起，产生另一个同样类型的函数。如果其中一个函数返回None，则组合函数也应返回None。例如：
  def f(x : Double) = if ( x >= 0) Some(sqrt(x)) else None
  def g(x : Double) = if ( x != 1) Some( 1 / ( x - 1)) else None
  val h = compose(f,g)
  h(2)将得到Some(1)，而h(1)和h(0)将得到None
   */
  def f(x: Double): Option[Double] = if (x >= 0) Some(sqrt(x)) else None

  def g(x: Double): Option[Double] = if (x != 1) Some(1 / (x - 1)) else None

  //根据需求合并成一个函数
  def compose(f: Double => Option[Double], g: Double => Option[Double]): Double => Option[Double] = {
    //返回了一个匿名的函数
    (x: Double) => {
      //合并
      //1.如果其中一个函数返回None，则组合函数也返回None
      if (f(x).isEmpty || g(x).isEmpty) None
      //2.h(2)将得到Some(1)
      else g(x)
    }
  }
}
