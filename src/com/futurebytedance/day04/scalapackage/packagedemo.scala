//代码说明
//1.package com.futurebytedance{} 表示我们创建了包 com.atguigu,在{}中
//我们可以继续写它的子包 scala //com.futurebytedance.scala,还可以写类，特质trait，还可以写object
//2.即scala支持，在一个文件中可以同时创建多个包以及给各个包创建类，trait和object
package com.futurebytedance { //包 com.futurebytedance
  class User { //在 com.futurebytedance包下创建了User类
    def sayHello(): Unit = {
      //想使用com.futurebytxedance.scala2包下的Monster
      import com.futurebytedance.scala2.Monster
      val monster = new Monster
    }
  }

  package scala2 { //创建包 com.futurebytedance.scala2

    class User { //在 com.futurebytxedance.scala2包下创建了User类

    }

    class Monster {

    }

  }

  //
  //说明
  //1.在包中直接写方法，或者定义变量，就报错  ==> 使用包对象的技术来解决
  //2.package object scala 表示创建一个包对象scala，他是com.futurebytedance这个包对应的包对象
  //3.每一个包都可以有包对象
  //4.包对象的名字需要和子包一样
  //5.在包对象中可以定义变量，方法
  //6.在包对象中定义的变量和方法，就可以在对应的包中使用
  //7.在底层这个包对象会生成两个类package.class 和 package$.class
  package object scala {
    val name = "king"

    def sayHi(): Unit = {
      println("package object scala sayHi")
    }
  }

  package scala { //包 com.futurebytedance.scala

    //在包中直接写方法，或者定义变量，就报错
    //    val name = "king"
    //    def sayHi():Unit = {}

    class Person {
      val name = "Nick"

      def play(message: String): Unit = {
        println(this.name + " " + message)
      }
    }

    class User {
      def testUser(): Unit = {
        println("scala User~~~")
      }
    }

    object Test { //表示在 com.futurebytedance.scala 创建object Test
      def main(args: Array[String]): Unit = {
        println("使用 name=" + name)
        //使用包对象的方法
        sayHi()

        println("ok")
        //我们可以直接使用父包中的内容
        //1.如果有同名的类，则采用就近原则来使用内容(比如说包)
        //2.如果就是要使用父包的类，则指定路径即可
        val user = new User
        println("User=" + user)

        val user2 = new scala2.User
        println("User=" + user2)
      }
    }

  }

}
