package com.futurebytedance.day12.upperbounds

/**
 * @author yuhang.sun
 * @date 2021/3/14 - 1:19
 * @version 1.0
 * @Description 上界
 */
object UpperBoundsDemo02 {
  def main(args: Array[String]): Unit = {
    biophony(Seq(new Bird, new Bird)) //?
    biophony(Seq(new Animal, new Animal)) //?
    biophony(Seq(new Animal, new Bird)) //?
    //biophony(Seq(new Earth, new Earth)) //?
  }

  def biophony[T <: Animal](things: Seq[T]): Seq[Unit] = things map (_.sound())
}

class Earth { //Earth 类
  def sound() { //方法
    println("hello !")
  }
}

class Animal extends Earth {
  override def sound(): Unit = { //重写了Earth的方法sound()
    println("animal sound")
  }
}

class Bird extends Animal {
  override def sound(): Unit = { //将Animal的方法重写
    println("bird sounds")
  }
}
