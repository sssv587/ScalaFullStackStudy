package com.futurebytedance.day12.viewbounds

/**
 * @author yuhang.sun
 * @date 2021/3/14 - 2:07
 * @version 1.0
 * @Description
 */
object MyImplicit {
  implicit def person3toOrderedPerson3(p3:Person3): Ordered[Person3] = new Ordered[Person3] {
    override def compare(that: Person3): Int = { //是你自己的业务逻辑
      p3.age - that.age
    }
  }
}
