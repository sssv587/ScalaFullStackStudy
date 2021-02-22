package com.futurebytedance.day05.tariti

/**
 * @author yuhang.sun
 * @date 2021/2/21 - 20:06
 * @version 1.0
 * @Description
 */
object TraitDemo03 {
  def main(args: Array[String]): Unit = {
    val sheep = new Sheep
    sheep.sayHi()
    sheep.sayHello()
  }
}

trait Trait03 {
  //抽象方法
  def sayHi()

  //实现普通方法
  def sayHello(): Unit = {
    println("say Hello~~~")
  }
}

//当一个trait有抽象方法和非抽象方法时
//1.一个trait在底层对应两个 Trait03.class接口
//2.还对应 Trait03$class.class Trait03$class抽象类

//当trait有接口和抽象类时
//1.class Sheep extends Trait03 在底层 对应 class Sheep implements Trait03
//2.当在Sheep中要是用Trait03的实现的方法，就通过 Trait03$class 来调用
class Sheep extends Trait03 {
  override def sayHi(): Unit = {
    println("小羊 say hi~~~")
  }
}
