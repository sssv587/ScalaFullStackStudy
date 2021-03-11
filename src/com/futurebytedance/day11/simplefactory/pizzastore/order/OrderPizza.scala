package com.futurebytedance.day11.simplefactory.pizzastore.order

import com.futurebytedance.day11.simplefactory.pizzastore.pizza.Pizza

import scala.io.StdIn
import scala.util.control.Breaks.{break, breakable}


/**
 * @author yuhang.sun
 * @date 2021/3/12 - 0:05
 * @version 1.0
 * @Description
 */
class OrderPizza {
  var orderType: String = _
  var pizza: Pizza = _
  breakable {
    do {
      println("请输入pizza的类型 使用简单工厂模式~~")
      orderType = StdIn.readLine()
      pizza = SimpleFactory.createPizza(orderType)
      if (pizza == null) {
        break()
      }
      this.pizza.prepare()
      this.pizza.bake()
      this.pizza.cut()
      this.pizza.box()
    } while (true)
  }
}
