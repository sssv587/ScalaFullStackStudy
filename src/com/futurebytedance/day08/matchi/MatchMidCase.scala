package com.futurebytedance.day08.matchi

/**
 * @author yuhang.sun
 * @date 2021/3/4 - 22:19
 * @version 1.0
 * @Description case语句的中缀表达式
 */
object MatchMidCase {
  def main(args: Array[String]): Unit = {
    val list = List(1, 3, 5, 9)
    list match {
      //1.两个元素间::叫中缀表达式，至少first、second两个匹配才行
      //2.first匹配第一个，second匹配第二个，rest匹配剩余元素
      case first :: second :: rest => println(first + "**" + second + "**" + rest)
      case _ => println("匹配不到...")
    }

  }
}
