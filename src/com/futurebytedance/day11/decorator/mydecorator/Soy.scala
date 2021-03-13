package com.futurebytedance.day11.decorator.mydecorator

import com.futurebytedance.day11.decorator.Drink


class Soy(obj: Drink) extends Decorator(obj) {
  setDescription("Soy")
  setPrice(1.5f)
}
