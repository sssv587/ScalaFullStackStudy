package com.futurebytedance.day06.homework

/**
 * @author yuhang.sun
 * @date 2021/2/21 - 0:30
 * @version 1.0
 * @Description
 *
 * 编写一个 Scala 应用程序,使用 App 特质,以反序打印命令行参数,用空格隔开。
 * 举例来说,scala Reverse Hello World 应该打印 World Hello
 */
object Exercise03 extends App {
  private val args2: Array[String] = args.reverse
  println(args.mkString(" "))
  println(args2.mkString(" "))
}
