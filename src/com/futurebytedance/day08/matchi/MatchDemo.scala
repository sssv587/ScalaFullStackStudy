package com.futurebytedance.day08.matchi

/**
 * @author yuhang.sun
 * @date 2021/3/2 - 22:42
 * @version 1.0
 * @Description 模式匹配
 *
 * 1)如果所有case都不匹配，那么执行case _ 分支，类似于Java中default语句
 * 2)如果所有case都不匹配，又没有写case _ 分支，那么会抛出MatchError
 * 3)每个case中，不用break语句，自动中断case
 * 4)可以在match中使用其它类型，而不仅仅是字符,可以是表达式 => 类似于 java swtich 的 :
 * 5) => 后面的代码块到下一个case, 是作为一个整体执行，可以使用{} 括起来，也可以不括。
 *
 */
object MatchDemo {
  def main(args: Array[String]): Unit = {
    // 模式匹配，类似于Java的switch语法
    val operator = 1
    val n1 = 20
    val n2 = 10
    var res = 0
    //说明
    //1.match (类似java switch)和case关键字
    //2.如果匹配成功，则执行 => 后面的代码块
    //3.匹配的顺序是从上到下，匹配到一个就执行对应的代码
    //4.=> 后面的代码块 不要写break ，会自动的退出match
    //5.如果一个都没有匹配到，则执行case _ 后面的代码块
    operator match {
      case '+' => res = n1 + n2
      case '-' => res = n1 - n2
      case '*' => res = n1 * n2
      case '/' => res = n1 / n2
      case 1 => println("匹配到1")
      case 1.1 => println("匹配到1.1")
      case _ => println("oper error")
    }
    println("res=" + res)
  }
}
