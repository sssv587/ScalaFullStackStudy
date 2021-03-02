package com.futurebytedance.day08.matchi

/**
 * @author yuhang.sun
 * @date 2021/3/3 - 1:39
 * @version 1.0
 * @Description for表达式中的模式
 */
object MatchFor {
  def main(args: Array[String]): Unit = {
    val map = Map("A" -> 1, "B" -> 0, "C" -> 3)
    for ((k, v) <- map) {
      println(k + " -> " + v)
    }

    //说明
    //只遍历出value=0的key-value，其他的过滤掉了
    for ((k, 0) <- map) {
      println(k + " --> " + 0)
    }

    //说明，这个就是上面代码的另外写法，只是下面的用法更灵活和强大
    for ((k, v) <- map if v == 0) {
      println(k + " ---> " + v)
    }
  }
}
