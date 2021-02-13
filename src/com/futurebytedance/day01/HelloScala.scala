package com.futurebytedance.day01

/**
 * @author yuhang.sun
 * @date 2021/2/7 - 1:11
 * @version 1.0
 * @Description
 */

//说明
//1.object表示一个伴生对象，这里我们可以简单的理解就是一个对象
//2.HelloScala就是对象名字，它底层真正对应的类名是HelloScala$，对象是这个类型的一个静态对象
//3.当我们编写一个object HelloScala底层会生成两个.class文件，分别是HelloScala和$HelloScala
//4.scala在运行时，流程如下

object HelloScala {
  //说明
  //1.def表示是一个方法，这是一个关键字
  //2.main表示方法的名称，表示程序入口
  //3.args:Array[String]表示形参，scala的特点是将参数名在前，类型后
  //4.Array[String]表示类型数组
  //5.Unit = 表示该函数的返回值为空(void)
  //6.println("hello world") 输出一句话
  def main(args: Array[String]): Unit = {
    println("hello world")
  }
}
