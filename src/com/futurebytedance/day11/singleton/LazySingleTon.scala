package com.futurebytedance.day11.singleton

/**
 * @author yuhang.sun
 * @date 2021/3/12 - 1:15
 * @version 1.0
 * @Description 单例模式 - 懒汉式
 */
object TestSingleTon {
  def main(args: Array[String]): Unit = {
    val instance1: SingleTon = SingleTon.getInstance
    val instance2: SingleTon = SingleTon.getInstance
    println(instance1 == instance2)
  }
}

//将SingleTon的构造方法私有化
class SingleTon private() {}

//懒汉式
object SingleTon {
  private var s: SingleTon = null

  def getInstance: SingleTon = {
    if (s == null) {
      s = new SingleTon
    }
    s
  }
}