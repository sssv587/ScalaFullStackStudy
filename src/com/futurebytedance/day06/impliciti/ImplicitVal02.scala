package com.futurebytedance.day06.impliciti

/**
 * @author yuhang.sun
 * @date 2021/2/24 - 22:27
 * @version 1.0
 * @Description 优先级：显式调用 > 隐式值 > 默认值
 *
 * 1.当在程序中，同时有隐式值，默认值，传值
 * 2.编译器的优先级为 传值 > 隐式值 > 默认值
 * 3.在隐式值匹配时，不能用二意性
 * 4.如果三个隐式值，默认值，传值一个都没有，就会报错
 */
object ImplicitVal02 {
  def main(args: Array[String]): Unit = {
    // 隐式变量（值）
    //implicit val name1: String = "Scala"
    //implicit val name2: String = "World"

    def hello(implicit content: String = "jack"): Unit = {
      println("Hello " + content)
    }

    hello

    //当同时有implicit 值和默认值，implicit 优先级高
    def hello2(implicit content: String = "jack"): Unit = {
      println("Hello2 " + content)
    } //调用hello
    hello2

    //说明
    //1.当一个隐式参数匹配不到隐式值，仍然会使用默认值
    implicit val name: Int = 10

    def hello3(implicit content: String = "jack"): Unit = {
      println("Hello3 " + content)
    } //调用hello
    hello3 //  hello3 jack

    //当没有隐式值，没有默认值，又没有传值，就会报错
    //    def hello4(implicit content: String ): Unit = {
    //      println("Hello4 " + content)
    //    } //调用hello
    //    hello4 //  hello3 jack
  }
}
