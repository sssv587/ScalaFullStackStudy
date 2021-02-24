package com.futurebytedance.day06.impliciti

/**
 * @author yuhang.sun
 * @date 2021/2/24 - 22:19
 * @version 1.0
 * @Description 隐式值
 * 隐式值也叫隐式变量，将某个形参变量标记为implicit，所以编译器会在方法省略隐式参数的情况下去搜索作用域内的隐式值作为缺省参数
 *
 * 调用隐式值时，直接使用方法名即可，不用加括号
 */
object ImplicitValDemo03 {
  def main(args: Array[String]): Unit = {
    implicit val str1: String = "jack" //这个就是隐式值
    //implicit name:就是隐式参数
    def hello(implicit name: String): Unit = {
      println(name + " hello")
    }

    hello // 底层hello("jack~")
  }
}
