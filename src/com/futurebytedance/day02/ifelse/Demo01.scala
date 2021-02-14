package com.futurebytedance.day02.ifelse

import scala.io.StdIn // 单独的引用一个StdIn
//import scala.io._ //_表示将scala.io包的所有内容一起引入

/**
 * @author yuhang.sun
 * @date 2021/2/15 - 0:15
 * @version 1.0
 * @Description 单分支
 */
object Demo01 {
  def main(args: Array[String]): Unit = {
    println("输入年龄:")
    val age: Int = StdIn.readInt()
    if (age > 18) {
      println("age>18")
    }

    //小的技巧，如何查看某个包下包含的内容
    //1.比如我们想看scala.io包有什么内容
    //2.将光标放在io上即可，输入ctrl+b
    //3.将光标放在StdIn，输入ctrl+b，看的是StdIn的源码
    //import scala.io.StdIn
  }
}
