package com.futurebytedance.day06.innerclass

/**
 * @author yuhang.sun
 * @date 2021/2/22 - 22:41
 * @version 1.0
 * @Description Scala内部类的使用
 * 内部类访问外部类属性
 * 1)内部类如果想要访问外部类的属性，可以通过外部类对象访问。即：访问方式：外部类名.this.属性名
 * 2)内部类如果想要访问外部类的属性，也可以通过外部类别名访问(推荐)。即：访问方式：外部类名别名.属性名【外部类名.this  等价 外部类名别名】
 *
 * 类型投影
 * 1)类型投影是指：在方法声明上，如果使用  外部类#内部类  的方式，表示忽略内部类的对象关系，等同于Java中内部类的语法操作，我们将这种方式称之为 类型投影（即：忽略对象的创建方式，只考虑类型）
 */
object ScalaInnerClassDemo {
  def main(args: Array[String]): Unit = {
    val outer1: ScalaOuterClass = new ScalaOuterClass();
    val outer2: ScalaOuterClass = new ScalaOuterClass();

    // Scala创建内部类的方式和Java不一样，将new关键字放置在前，使用  对象.内部类  的方式创建
    // 默认情况下内部类实例和外部对象关联
    val inner1 = new outer1.ScalaInnerClass()
    val inner2 = new outer2.ScalaInnerClass()

    //使用inner1调用info()
    inner1.info()

    //去调用test
    inner1.test(inner1)
    inner1.test(inner2)

    //在默认情况下，scala的内部类的实例和创建内部类实例的外部对象关联。


    //创建静态内部类对象
    val staticInner = new ScalaOuterClass.ScalaStaticInnerClass()
    println(staticInner)

  }
}

//外部类
//内部类访问外部类的方法1 外部类名.this.属性
//class ScalaOuterClass {
//  var name: String = "scott"
//  private val sal: Double = 1.2
//
//  class ScalaInnerClass { //成员内部类
//    def info(): Unit = {
//      // 访问方式：外部类名.this.属性名
//      // 怎么理解 ScalaOuterClass.this 就相当于是 ScalaOuterClass 这个外部类的一个实例,
//      // 然后通过 ScalaOuterClass.this 实例对象去访问 name 属性
//      // 只是这种写法比较特别，学习java的同学可能更容易理解 ScalaOuterClass.class 的写法.
//      println("name = " + ScalaOuterClass.this.name
//        + " sal =" + ScalaOuterClass.this.sal)
//    }
//  }
//
//}

class ScalaOuterClass {
  myOuter => //你可以理解成这样写，myOuter就是代表外部类的一个对象.
  class ScalaInnerClass { //成员内部类
    def info(): Unit = {
      println("name = " + ScalaOuterClass.this.name
        + " sal =" + ScalaOuterClass.this.sal)
      println("-----------------------------------")
      println("name = " + myOuter.name
        + " sal =" + myOuter.sal)
    }

    //这里有一个方法，可以接受ScalaInnerClass实例
    //下面的ScalaOuterClass#ScalaInnerClass类型投影的作用就是屏蔽外部对象对内部类对象的影响
    def test(ic: ScalaOuterClass#ScalaInnerClass): Unit = {
      println("使用了类型投影:" + ic)
    }
  }

  // 当给外部指定别名时，需要将外部类的属性放到别名后.
  var name: String = "jack"
  private var sal: Double = 800.2
}


object ScalaOuterClass { //伴生对象
  class ScalaStaticInnerClass { //静态内部类
  }

}

