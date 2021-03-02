package com.futurebytedance.day08.matchi

/**
 * @author yuhang.sun
 * @date 2021/3/2 - 22:56
 * @version 1.0
 * @Description 模式匹配守卫
 */
object MatchIfDemo {
  def main(args: Array[String]): Unit = {
    for (ch <- "+-3!") {
      var sign = 0
      var digit = 0
      ch match {
        case '+' => sign = 1
        case '-' => sign = -1
        //如果case后右条件守卫即if，这时_不是表示默认匹配
        //表示忽略传入的ch
        case _ if ch.toString.equals("3") => digit = 3
        case _ if ch > 10 => println("ch > 10")
        case _ => sign = 2
      }
      //分析
      // + 1 0
      // - -1 0
      // 3 0 3
      // ch > 10
      // ! 0 0
      println(ch + " " + sign + " " + digit)
    }
  }
}
