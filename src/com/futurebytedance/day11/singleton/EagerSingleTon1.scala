package com.futurebytedance.day11.singleton

/**
 * @author yuhang.sun
 * @date 2021/3/12 - 1:19
 * @version 1.0
 * @Description 单例模式 - 饿汉式
 */
class TestSingleTon1 {
  def main(args: Array[String]): Unit = {
    val singleTon = SingleTon2.getInstance()
    val singleTon1 = SingleTon2.getInstance()
    println(singleTon == singleTon1)
  }
}

//将SingleTon2的构造方法进行私有化
class SingleTon2 private() {}

//饿汉式
object SingleTon2 {
  private val s: SingleTon2 = new SingleTon2

  def getInstance(): SingleTon2 = {
    s
  }
}

