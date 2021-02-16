package com.futurebytedance.day04.method

/**
 * @author yuhang.sun
 * @date 2021/2/17 - 0:54
 * @version 1.0
 * @Description
 */
object MethodDemo02 {
  def main(args: Array[String]): Unit = {
    /*
    编写类(MethodExec)，编写一个方法，方法不需要参数，在方法中打印一个10*8 的矩形，在main方法中调用该方法。
     */
    val methodExec = new MethodExec
    methodExec.printRect()

    /*
     修改上一个程序，编写一个方法，提供m和n两个参数，方法中打印一个m*n的矩形，再编写一个方法算该矩形的面积(可以接收长len，和宽width)， 将其作为方法返回值。在main方法中调用实现矩形的打印和面积的计算
     分析：
     1.长和宽需要设计成属性
     */
    methodExec.len = 2.1
    methodExec.width = 3.4
    println("面积=" + methodExec.area())
  }
}

class MethodExec {
  //属性
  var len = 0.0
  var width = 0.0

  def printRect(): Unit = {
    for (i <- 0 until 10) {
      for (j <- 0 until 8) {
        print("*")
      }
      println()
    }
  }

  //计算面积的方法
  def area(): Double = {
    (this.len * this.width).formatted("%.2f").toDouble
  }
}
