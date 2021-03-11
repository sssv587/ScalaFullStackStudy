package com.futurebytedance.day11.simplefactory.order

import com.futurebytedance.day11.simplefactory.pizza.{CheesePizza, GreekPizza, PepperPizza, Pizza}

/**
 * @author yuhang.sun
 * @date 2021/3/12 - 0:14
 * @version 1.0
 * @Description
 */
object SimpleFactory {
  //提供了一个创建Pizza的方法,有需要创建Pizza调用该方法即可
  def createPizza(t: String): Pizza = {
    var pizza: Pizza = null
    if (t.equals("greek")) {
      pizza = new GreekPizza
    } else if (t.equals("pepper")) {
      pizza = new PepperPizza
    } else if (t.equals("cheese")) {
      pizza = new CheesePizza
    }
    pizza
  }
}
