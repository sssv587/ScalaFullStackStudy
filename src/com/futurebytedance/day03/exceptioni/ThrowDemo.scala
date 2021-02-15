package com.futurebytedance.day03.exceptioni

/**
 * @author yuhang.sun
 * @date 2021/2/16 - 2:44
 * @version 1.0
 * @Description
 */
object ThrowDemo {
  def main(args: Array[String]): Unit = {
    //    val res = test()
    //    println(res)

    //如果我们希望在test()抛出异常后，代码可以继续执行，则我们需要处理
    try {
      test()
    } catch {
      case ex: Exception => {
        println("捕获到了一个异常," + ex.getMessage)
        println("xxxx")
      }
      case ex: ArithmeticException => println("得到了一个算术异常" + ex)
    } finally {
      //写上对try{}中的资源的分配

    }

    println("ok~~~")
  }

  def test(): Nothing = {
    throw new Exception("异常NO1出现")
  }
}
