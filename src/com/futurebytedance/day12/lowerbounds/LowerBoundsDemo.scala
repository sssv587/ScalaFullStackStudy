package com.futurebytedance.day12.lowerbounds

/**
 * @author yuhang.sun
 * @date 2021/3/14 - 1:30
 * @version 1.0
 * @Description 下界
 */
object LowerBoundsDemo {
  def main(args: Array[String]): Unit = {
    //满足下界的约束
    biophony(Seq(new Earth, new Earth)).foreach(_.sound())
    //满足下界的约束
    biophony(Seq(new Animal, new Animal)).foreach(_.sound())
    //这里我们不能使用上界的思路去推倒，这个可以直接运行
    //1)只不过和Animal直系的，是Animal父类的按照父类处理，是Animal子类的按照Animal处理
    //2)和Animal无关的，一律按照Object处理！
    biophony(Seq(new Bird, new Bird)).foreach(_.sound())

    biophony(Seq(new Moon))

    val res = biophony(Seq(new Bird))

    val res2 = biophony(Seq(new Object))
    val res3 = biophony(Seq(new Moon))
    println("res2=" + res2)
    println("res3=" + res3)
  }

  def biophony[T >: Animal](things: Seq[T]): Seq[T] = things
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

class Moon {
  def sound(): Unit = { //将Animal的方法重写
    println("moon sounds")
  }
}
