package com.futurebytedance.day06.mixin

/**
 * @author yuhang.sun
 * @date 2021/2/22 - 21:04
 * @version 1.0
 * @Description 在特质中重写抽象方法
 */
object MinInDemo02 {
  def main(args: Array[String]): Unit = {
    val mysql5 = new MySQL5 with DB5 with File5
    //1.将数据保存到文件中..
    //2.将数据保存到数据库中..
    mysql5.insert(100)


    //下面的混入方式是错误的
    //val mysql5 = new MySQL5 with File5
    //mysql5.insert(666)
  }
}

trait Operate5 {
  def insert(id: Int)
}

trait File5 extends Operate5 {
  //说明
  //1.如果我们在子特质中重写/实现了一个父特质的抽象方法，但是同时调用super
  //2.这时我们的方法不是完全实现，因此需要声明为abstract override
  //3.这时super.insert(id)的调用就和动态混入的顺序有密切关系
  abstract override def insert(id: Int): Unit = {
    println("将数据保存到文件中..")
    super.insert(id)
  }
}

trait DB5 extends Operate5 { //我们继承Operator5，并实现了Operator的insert
  def insert(id: Int): Unit = {
    println("将数据保存到数据库中..")
  }
}

class MySQL5 {}
