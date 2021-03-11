package com.futurebytedance.day11.abstractfactory.order

object PizzaStore {
  def main(args: Array[String]): Unit = {
    new OrderPizza(new BJFactory)
    //new OrderPizza(new LDFactory)
  }
}
