package com.futurebytedance.day02.fori

/**
 * @author yuhang.sun
 * @date 2021/2/15 - 3:05
 * @version 1.0
 * @Description
 */
object ForDemo01 {
  def main(args: Array[String]): Unit = {
    //输出10句 "你好，世界!"
    val start = 1
    val end = 10
    //说明
    //1.start从哪个数开始循环
    //2.to是关键字
    //3.end循环结束的值
    //4.start to end 表示前后闭合
    for (i <- start to end) {
      println("你好，世界!\t" + i)
    }

    //说明 for 这种推倒时，也可以直接对集合进行遍历
    val list = List("hello", 10, 30, "tom")
    for (item <- list) {
      println("item=" + item)
    }
  }
}
