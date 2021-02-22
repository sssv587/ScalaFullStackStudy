package com.futurebytedance.day06.mixin

/**
 * @author yuhang.sun
 * @date 2021/2/22 - 20:57
 * @version 1.0
 * @Description 测试叠加特质
 */
object Test {
  def main(args: Array[String]): Unit = {
    val s5 = new s55 with s22 with s44
    s5.say()
  }
}

trait s1 {
  def say()
}

trait s2 extends s1 {
  override def say(): Unit = {
    println("s2")
  }
}

trait s22 extends s2 {
  override def say(): Unit = {
    println("s22")
    super.say()
  }
}

trait s3 {
  def sayHi()
}

trait s4 extends s3 {
  override def sayHi(): Unit = {
    println("s4")
  }
}

trait s44 extends s3 {
  override def sayHi(): Unit = {
    println("s44")
  }
}

class s55{}