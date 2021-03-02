package com.futurebytedance.day08.matchi

/**
 * @author yuhang.sun
 * @date 2021/3/2 - 23:29
 * @version 1.0
 * @Description 模式匹配-变量
 */
object MatchVar {
  def main(args: Array[String]): Unit = {
    val ch = 'V'
    ch match {
      case '+' => println("ok~")
      //下面 case mychar 的含义是 mychar = ch
      case mychar => println("ok~" + mychar)
      case _ => println("ok~~")
    }

    val ch1 = '+'
    //match是一个表达式，因此可以有返回值
    //返回值就是代码块的最后一句话的值
    val res = ch1 match {
      case '+' => ch1 + " hello"
      case _ => println("ok~~")
    }
    println("res=" + res)
  }
}
