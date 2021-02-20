package com.futurebytedance.day05.extendsi

/**
 * @author yuhang.sun
 * @date 2021/2/21 - 1:16
 * @version 1.0
 * @Description
 */
object SingleTonDemo {
  //实现单例
  def main(args: Array[String]): Unit = {
    val dog = Dog
    val dog2 = Dog
    println(dog)
    println(dog2)
  }
}

class Dog private() {

}

object Dog {
  var singleDog: Dog = null

  def apply(): Dog = {
    if (singleDog == null) {
      singleDog = new Dog
    }
    singleDog
  }
}
