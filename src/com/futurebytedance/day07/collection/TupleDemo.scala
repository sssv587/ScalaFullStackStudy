package com.futurebytedance.day07.collection

/**
 * @author yuhang.sun
 * @date 2021/2/28 - 15:47
 * @version 1.0
 * @Description Scala的元祖
 *
 * 元组也是可以理解为一个容器，可以存放各种相同或不同类型的数据。
 * 说的简单点，就是将多个无关的数据封装为一个整体，称为元组, 最大的特点灵活,对数据没有过多的约束。
 *
 */
object TupleDemo {
  def main(args: Array[String]): Unit = {
    //创建
    //说明 1.tuple1就是一个Tuple 类型时Tuple4
    //简单说明：为了高效操作元祖，编译器根据元素的个数不同，对应不同的元祖类型
    //分别是Tuple1 ~ Tuple22
    val tuple1 = (1, 2, 3, "hello", 4)
    println(tuple1)

    //访问元祖
    val t1 = (1, "a", "b", true, 2)
    println(t1._1) //访问元组的第一个元素 ，从1开始
    println(t1._4) //访问元组的第四个元素 : true
    /*
    override def productElement(n: Int) = n match {
    case 0 => _1
    case 1 => _2
    case 2 => _3
    case 3 => _4
    case 4 => _5
    case _ => throw new IndexOutOfBoundsException(n.toString())
 }
     */
    println(t1.productElement(0)) // 访问元组的第一个元素，从0开始

    //遍历元祖,元祖的遍历需要使用到迭代器
    for (item <- t1.productIterator) {
      println("item=" + item)
    }
  }
}
