package com.futurebytedance.day05.extendsi

/**
 * @author yuhang.sun
 * @date 2021/2/20 - 1:37
 * @version 1.0
 * @Description var重写抽象的var属性小结
 * 抽象属性：声明未初始化的变量就是抽象的属性，抽象属性在抽象类
 * 1.一个属性没有初始化，那么这个属性就是抽象属性
 * 2.抽象属性在编译成字节码文件时，属性并不会声明，但是会自动生成抽象方法，所以类必须声明为抽象类
 * 3.如果是覆写一个父类的抽象属性，那么override 关键字可省略(本质上是实现)
 */
object FiledOverrideDetail03 {
  def main(args: Array[String]): Unit = {

  }
}

//在A03中，有一个抽象的字段(属性)
//1.抽象的字段(属性):就是没有初始化的字段(属性)
//2.当一个类含有抽象属性时，则该类需要标记为abstract
//3.对于抽象的属性，在底层不会生成对应的属性声明，而是生成两个对应的抽象方法(name,name$_eq)
abstract class A03 {
  var name: String //抽象
  var age: Int = 10
}

class Sub_A03 extends A03 {
  //说明
  //1.如果我们在子类中去重写父类的抽象属性，本质是实现了抽象方法
  //2.因此这里我们可以写override，也可以不写
  override var name: String = ""
//  override var age:Int = 10
}