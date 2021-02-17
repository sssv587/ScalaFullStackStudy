package com.futurebytedance.day04.scalapackage

/**
 * @author yuhang.sun
 * @date 2021/2/17 - 3:38
 * @version 1.0
 * @Description scala包的概述
 * 1.基本语法
 * package 包名
 *
 * 2.Scala包的三大作用(和Java一样)
 * 1) 区分相同名字的类
 * 2) 当类很多时,可以很好的管理类
 * 3) 控制访问范围
 *
 * 3.Scala中包名和源码所在的系统文件目录结构要可以不一致，但是编译后的字节码文件路径和包名会保持一致(这个工作由编译器完成)。
 *
 * 4.命名规则：只能包含数字、字母、下划线、小圆点.,但不能用数字开头, 也不要使用关键字
 *
 * 5.Scala会自动引入的常用包 java.lang.*、scala包、Predef包
 */
object TestTiger {
  def main(args: Array[String]): Unit = {
    //使用xh的Tiger
    val tiger1 = new com.futurebytedance.day04.scalapackage.xh.Tiger

    //使用xm的Tiger
    val tiger2 = new com.futurebytedance.day04.scalapackage.xm.Tiger

    println("tiger1=" + tiger1 + " tiger2=" + tiger2)
  }
}

class Employee {

}