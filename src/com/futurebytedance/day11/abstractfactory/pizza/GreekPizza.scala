package com.futurebytedance.day11.abstractfactory.pizza

class GreekPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "希腊pizza"
    println(this.name + " preparing")
  }
}
