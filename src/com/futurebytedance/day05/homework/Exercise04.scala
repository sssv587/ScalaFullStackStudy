package com.futurebytedance.day05.homework

/**
 * @author yuhang.sun
 * @date 2021/2/18 - 23:29
 * @version 1.0
 * @Description
 */
//说明
//1. 当我们继承了App后，就可以直接在这个类中执行代码,不需要在写main入口
//2.
object Exercise04 extends App {

  import java.util.{HashMap => JavaHashMap} //重命名
  import collection.mutable.{HashMap => ScalaHashMap, _}

  val javaMap = new JavaHashMap[Int, String] //[Int,String]泛型
  javaMap.put(1, "One"); //加入了四对 key-val
  javaMap.put(2, "Two");
  javaMap.put(3, "Three");
  javaMap.put(4, "Four");
  val scalaMap = new ScalaHashMap[Int, String] //创建scala的map
  //说明
  //1.javaMap.keySet().toArray,这里是将javaMap的key转成数组
  //2.key.asInstanceOf[Int]:将key转成Int类型
  //3.javaMap.get(key),得到这个key对应的value
  //4.(key.asInstanceOf[Int] -> javaMap.get(key) 是key-value
  //5.+= 将 key -> value加入(拷贝)到scalaMap

  for (key <- javaMap.keySet().toArray) {

    scalaMap += (key.asInstanceOf[Int] -> javaMap.get(key))
  }
  println(scalaMap.mkString(" "))

}