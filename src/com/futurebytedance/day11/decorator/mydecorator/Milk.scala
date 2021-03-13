package com.futurebytedance.day11.decorator.mydecorator

import com.futurebytedance.day11.decorator.Drink


class Milk(obj: Drink) extends Decorator(obj) {

  setDescription("Milk")
  setPrice(2.0f)
}
