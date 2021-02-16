package com.futurebytedance.day04.homework

/**
 * @author yuhang.sun
 * @date 2021/2/17 - 0:24
 * @version 1.0
 * @Description
 */
object Exercise04 {
  def main(args: Array[String]): Unit = {
    val n = 3
    val res1 = (0 to n).reverse
    println(res1) //返回了Range(3,2,1,0)

    //foreach
    //foreach 函数 f: Int => U,即接收一个输入参数为Int，输出为U的函数
    //说明
    //1.将res1的每个元素依次遍历出来，传递给println(x)
//    res1.foreach(println)
    //2.将res1的每个元素依次遍历出来，传递给myShow(x)
    res1.foreach(myShow)

    //一步搞定
    println("-----------------------")
    (0 to n).reverse.foreach(println)
  }

  //自己写一个myShow
  def myShow(n: Int): Unit = {
    println("xxxxxxxxxx")
    println(n)
  }
}
