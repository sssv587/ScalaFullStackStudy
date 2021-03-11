package com.futurebytedance.day11.simplefactory.pizza

/**
 * @author yuhang.sun
 * @date 2021/3/12 - 0:10
 * @version 1.0
 * @Description
 */
class CheesePizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "奶酪pizza"
    println(this.name + " preparing")
  }
}
