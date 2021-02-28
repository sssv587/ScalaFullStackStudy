package com.futurebytedance.day07.collection

import scala.collection.mutable

/**
 * @author yuhang.sun
 * @date 2021/2/28 - 20:31
 * @version 1.0
 * @Description Scala的Map
 * 1、不可变Map
 * 1)从输出的结果看到，输出顺序和声明顺序一致
 * 2)构建Map集合中，集合中的元素其实是Tuple2类型
 * 3)默认情况下（即没有引入其它包的情况下）,Map是不可变map
 * 4)为什么说Map中的元素是Tuple2 类型 [反编译或看对应的apply]
 */
object MapDemo {
  def main(args: Array[String]): Unit = {
    //方式一-构造不可变映射
    //1.默认Map是 immutable.Map
    //2.key-value类型可以支持Any
    //3.在Map底层，每对key-value是Tuple2
    //4.在输出的结果看到，输出顺序和声明顺序一致
    val map1 = Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> "北京")
    println(map1)

    //方式2-构造可变映射
    //1.从输出的结果看到，输出顺序和声明顺序不一致
    val map2 = scala.collection.mutable.Map[String, Int]("Alice" -> 10, "Bob" -> 20, "Kotlin" -> 30)
    println(map2)

    //方式3-创建空的映射
    val map3 = new mutable.HashMap[String, Int]
    println(map3)

    //方式4-对偶元祖
    val map4 = mutable.Map(("Alice", 10), ("Bob", 20), ("Kotlin", 30))
    println(map4)
    println(map4("Alice"))

    //方式1-使用map(key)
    println(map4("Alice")) // 10
    //抛出异常(java.util.NoSuchElementException:key not found:)
    //println(map4("Alice~"))

    //方式2-使用contains方法检查是否存在key
    if (map4.contains("Bob~")) {
      println("key存在 值= " + map4("B"))
    } else {
      println("key不存在")
    }

    //方式3-使用map.get(key).get取值
    //1.如果key存在 map.get(key) 就会返回some(值) ,然后Some.get就可以取出
    //2.如果key不存在 map.get(key) 就会返回None
    println(map4.get("Alice").get)
    //println(map4.get("Alice~").get) //抛出异常

    //方式4-getOrElse()
    println(map4.getOrElse("Alice~", "默认的值<・)))><<"))


    //更新或增加映射元素
    val map5 = mutable.Map(("A", 1), ("B", "北京"), ("C", 3))
    //map是可变的，才能修改，否则报错
    //如果key存在：则修改对应的值,key不存在,等价于添加一个key-value
    map5("A") = 20 //修改或增加
    println(map5)

    //添加Map元素
    //方式1-增加单个元素
    map5 += ("D" -> 4)
    map5 += ("B" -> 50)
    println(map5)

    //方式2-增加多个元素
    map5 += ("EE" -> 1, "FF" -> 3)
    println(map5)

    //删除map元素
    map5 -= ("A", "B", "AAA")
    map5.remove("EE")
    println(map5)

    //Map的遍历
    val map6 = mutable.Map( ("A", 1), ("B", "北京"), ("C", 3) )
    for ((k, v) <- map6) println(k + " is mapped to " + v)
    for (v <- map6.keys) println(v)
    for (v <- map6.values) println(v)
    for (v <- map6) println(v + " key=" + v._1 + " value=" + v._2)
  }
}
