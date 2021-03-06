package com.futurebytedance.day09.highfunction

/**
 * @author yuhang.sun
 * @date 2021/3/7 - 1:56
 * @version 1.0
 * @Description 控制抽象
 * 控制抽象是这样的函数，满足如下条件
 * 1)参数是函数
 * 2)函数参数没有输入值也没有返回值
 *
 */
object ControlAbstractDemo01 {
  def main(args: Array[String]): Unit = {
    //myRunInThread 就是一个控制抽象
    //是没有输入也没有输出的函数 f1:() => Unit
    def myRunInThread(f1: () => Unit): Unit = {
      new Thread {
        override def run(): Unit = {
          f1()
        }
      }.start()
    }

    myRunInThread {
      () =>
        println("干活咯！5秒完成...")
        Thread.sleep(5000)
        println("干完咯！")
    }

    def myRunInThread2(f1: => Unit): Unit = {
      new Thread {
        override def run(): Unit = {
          f1
        }
      }.start()
    }

    //对于没有输入，也没有返回值的函数，可以简写成如下形式
    myRunInThread2 {
      println("干活咯！5秒完成...")
      Thread.sleep(5000)
      println("干完咯！")
    }
  }
}
