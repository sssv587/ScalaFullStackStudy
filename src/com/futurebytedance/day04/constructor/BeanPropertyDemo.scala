package com.futurebytedance.day04.constructor

import scala.beans.BeanProperty

/**
 * @author yuhang.sun
 * @date 2021/2/17 - 2:02
 * @version 1.0
 * @Description Bean属性
 */
object BeanPropertyDemo {
  def main(args: Array[String]): Unit = {
    val car = new Car
    car.name = "宝马"
    println(car.name)

    //使用@BeanProperty 自动生成 getXxx 和 setXxx
    car.setName("奔驰")
    println(car.getName)
  }
}

class Car {
  @BeanProperty var name: String = null
}
