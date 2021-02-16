package com.futurebytedance.day04.oop

/**
 * @author yuhang.sun
 * @date 2021/2/16 - 3:09
 * @version 1.0
 * @Description
 *
 * 1.基本语法
 * [修饰符] class 类名 {
 * 类体
 * }
 *
 * 2.定义类的注意事项
 * 1)scala语法中，类并不声明为public，所有这些类都具有公有可见性(即默认就是public)
 * 2)一个Scala源文件可以包含多个类.
 *
 */
object CatDemo {
  def main(args: Array[String]): Unit = {
    //创建一只猫
    val cat = new Cat
    //给猫的属性赋值当

    //说明
    //1.cat.name 其实不是直接访问属性，而是cat.name_$eq("小白")
    cat.name = "小白" //等价
    cat.age = 10
    cat.color = "白色"
    println("ok~~")
    printf("小猫的信息如下:%s %d %s", cat.name, cat.age, cat.color)
  }
}

//定义一个Cat
//一个class Cat 对应的字节码文件只有一个就是 Cat.class，默认是public
class Cat {
  //定义/声明三个属性
  //说明
  //1.当我们声明了var name:String时,在底层对应private name
  //2.同时会生成两个public方法 name() <=类似=> getter name_$eq() <=类似=> setter
  var name: String = "" //给初始值
  var age: Int = _ //_表示给age一个默认的值，如果是Int，默认就是0
  var color: String = _ //_给color默认值，如果是String，默认就是""
}

class Dog {
  var name = "jack"
  var lover = new Fish
}

class Fish {}