package com.futurebytedance.day02.ifelse

/**
 * @author yuhang.sun
 * @date 2021/2/15 - 2:47
 * @version 1.0
 * @Description
 */
object Demo04 {
  def main(args: Array[String]): Unit = {
    //如果大括号{}内的逻辑代码只有一行，大括号可以省略
    if (5 > 4) {
      println("5>4")
    }

    //Scala中任意表达式都是有返回值的，也就意味着if else表达式其实是有返回结果的，
    //具体返回结果的值取决于满足条件的代码体的最后一行内容.
    val age = 7
    val res = if (age > 20) {
      println("hello age > 20")
      9 + 10
      "yes ok"
    } else {
      7
    }
    println("res=" + res)
  }
}
