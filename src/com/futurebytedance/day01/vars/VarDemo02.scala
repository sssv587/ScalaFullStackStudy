package com.futurebytedance.day01.vars

/**
 * @author yuhang.sun
 * @date 2021/2/9 - 2:18
 * @version 1.0
 * @Description
 */
object VarDemo02 {
  def main(args: Array[String]): Unit = {
    //类型推导
    var num = 10 //这是num就是Int
    //方式1，可以利用idea的提示来证明
    //方式2，使用isInstanceOf[Int]判断
    println(num.isInstanceOf[Int])

    //类型确定后，就不能修改，说明scala是强数据类型语言
    //num = 2.3 错误

    //3.在声明/定义一个变量时，可以使用 var 或者 val 来修饰， var 修饰的变量可改变，val 修饰的变量不可改
    var age = 10 //即age是可以改变的
    age = 30 //ok

    val num2 = 30
    //num2 = 40 //val修饰的变量是不可以改变。

    //scala设计者为什么设计 var和val
    //(1)在实际编程中，我们更多的需求是获取/创建一个对象后，读取该对象的属性，或者是修改对象的属性值
    //但是我们很少去改变对象本身
    //dog = new Dog() dog.age = 10 dog = new Dog()
    //这时，我们就可以使用val
    //(2)因为val没有线程安全问题，因此效率高，scala的设计者推荐我们使用val
    //(3)如果对象需要改变，则使用var
    val dog = new Dog
    //dog = new Dog//Reassignment to val
    dog.age = 90 //ok
    dog.name = "小花" //ok
  }
}

class Dog {
  //声明一个age属性，给了一个默认值_
  var age: Int = _ //
  //声明名字
  var name: String = ""
}