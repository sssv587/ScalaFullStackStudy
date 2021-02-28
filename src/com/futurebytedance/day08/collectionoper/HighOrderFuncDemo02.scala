package com.futurebytedance.day08.collectionoper

/**
 * @author yuhang.sun
 * @date 2021/2/28 - 23:33
 * @version 1.0
 * @Description 高阶函数
 */
object HighOrderFuncDemo02 {
  def main(args: Array[String]): Unit = {
    test2(sayOK)

  }

  //说明：test2是一个高阶函数，可以接收一个 没有输入，返回为Unit的函数
  def test2(f: () => Unit): Unit = {
    f()
  }

  def sayOK(): Unit = {
    println("sayOKKK...")
  }

  def sub(n1: Int): Unit = {

  }

}
