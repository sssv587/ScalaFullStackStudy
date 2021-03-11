package com.futurebytedance.day11.simplefactory.pizzastore.pizza

/**
 * @author yuhang.sun
 * @date 2021/3/12 - 0:04
 * @version 1.0
 * @Description
 */
class PepperPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "胡椒pizza"
    println(this.name + "preparing")
  }
}
