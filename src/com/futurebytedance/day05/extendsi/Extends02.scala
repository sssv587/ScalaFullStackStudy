package com.futurebytedance.day05.extendsi

/**
 * @author yuhang.sun
 * @date 2021/2/19 - 0:04
 * @version 1.0
 * @Description
 */
//说明
//1.在scala中，子类继承了父类的所有属性
//2.但是private的属性和方法无法访问
object Extends02 {
  def main(args: Array[String]): Unit = {
    val sub = new Sub()
    sub.sayOk()
    //sub.test200() //
  }
}

//父类(基类)
class Base {
  var n1: Int = 1 //public n1()、public n1$eq()
  protected var n2: Int = 2
  private var n3: Int = 3 //private n3()、private n3$eq()

  def test100(): Unit = { //默认public test100()
    println("base 100")
  }

  protected def test200(): Unit = { // ?
    println("base 200")
  }

  private def test300(): Unit = { //private test300()
    println("base 300")
  }
}

//Sub 继承 Base
class Sub extends Base {
  def sayOk(): Unit = {
    this.n1 = 20 //这里访问本质this.n1$eq()
    this.n2 = 40
    println("范围" + this.n1 + this.n2)
  }

  test100()
  test200() //在子类中使用protected
}
