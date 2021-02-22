package com.futurebytedance.day05.tariti

/**
 * @author yuhang.sun
 * @date 2021/2/21 - 19:51
 * @version 1.0
 * @Description 特质
 * 一个类具有某种特质（特征），就意味着这个类满足了这个特质（特征）的所有要素，所以在使用时，也采用了extends关键字，如果有多个特质或存在父类，那么需要采用with关键字连接
 *
 * 1)没有父类 class  类名   extends   特质1   with    特质2   with   特质3 ...
 * 2)有父类 class  类名   extends   父类   with  特质1   with   特质2   with 特质3
 *
 * 特质trait的再说明
 * 1)Scala提供了特质（trait），特质可以同时拥有抽象方法和具体方法，一个类可以实现/继承多个特质
 * 2)特质中没有实现的方法就是抽象方法。类通过extends继承特质，通过with可以继承多个特质
 * 3)所有的java接口都可以当做Scala特质使用
 *
 */
object TraitDemo01 {
  def main(args: Array[String]): Unit = {

  }
}

//trait Serializable extends Any with java.io.Serializable
//在scala中，java的接口都可以当做trait来使用
object T1 extends Serializable {}

object T2 extends Cloneable {}