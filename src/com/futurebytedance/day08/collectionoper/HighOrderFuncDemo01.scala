package com.futurebytedance.day08.collectionoper

/**
 * @author yuhang.sun
 * @date 2021/2/28 - 23:20
 * @version 1.0
 * @Description 高阶函数
 */
object HighOrderFuncDemo01 {
  def main(args: Array[String]): Unit = {
    //使用高阶函数
    val res = test2(sum, 3.5)
    println(res)

    //在scala中，可以把一个函数直接赋给一个变量,但是不执行函数
    val f1 = myPrint _
    f1() //执行
  }

  def myPrint(): Unit = {
    println("hello world!")
  }

  //说明
  //1.test就是一个高阶函数
  //2.f: Double => Double表示一个函数，该函数可以接受一个Double，返回Double
  //3.n1：Double 普通参数
  //4.f(n1)在test函数中，执行你传入的函数
  def test2(f: Double => Double, n1: Double): Double = {
    f(n1)
  }

  //普通的函数
  def sum(d: Double): Double = {
    println("sum2被调用")
    d + d
  }

}

