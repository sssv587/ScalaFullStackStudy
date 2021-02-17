package com.futurebytedance.day04.packageimport

import scala.beans._ // _表示将该包中所有内容引入，等价"*"

/**
 * @author yuhang.sun
 * @date 2021/2/18 - 1:05
 * @version 1.0
 * @Description Scala引入包的细节和注意事项
 *
 * 1.在Scala中，import语句可以出现在任何地方，并不仅限于文件顶部，import语句的作用一直延伸到包含该语句的块末尾。这种语法的好处是：在需要时在引入包，缩小import 包的作用范围，提高效率
 * 2.Java中如果想要导入包中所有的类，可以通过通配符*，Scala中采用下划线_
 * 3.如果不想要某个包中全部的类，而是其中的几个类，可以采用选取器(大括号)
 * 4.如果引入的多个包中含有相同的类，那么可以将类进行重命名进行区分，这个就是重命名
 * 5.如果某个冲突的类根本就不会用到，那么这个类可以直接隐藏掉
 * import java.util.{ HashMap=>_, _}
 * var map = new HashMap()
 */
object TestImport {
  def main(args: Array[String]): Unit = {

  }
}

class User {

  import scala.beans.BeanProperty //在需要时才引入，作用域在{}
  @BeanProperty var name: String = ""

  def test(): Unit = {
    //可以使用选择器，选择引入包的内容,这里，我们只引入HashMap, HashSet
    import scala.collection.mutable.{HashMap, HashSet}
    var map = new HashMap()
    var set = new HashSet()
  }

  def test2(): Unit = {
    //下面的含义是 java.util.HashMap 重命名为 JavsHashMap
    import java.util.{HashMap => JavaHashMap, List}
    import scala.collection.mutable._
    var map = new HashMap() //此时的HashMap是scala中的HashMap
    var map1 = new JavaHashMap()//此时的JavaHashMap是java中的HashMap
  }
}

class Dog {
  @BeanProperty var name: String = ""
}
