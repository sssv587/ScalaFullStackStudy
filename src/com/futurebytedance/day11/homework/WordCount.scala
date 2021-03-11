package com.futurebytedance.day11.homework

/**
 * @author yuhang.sun
 * @date 2021/3/11 - 22:57
 * @version 1.0
 * @Description WordCount
 */
object WordCount {
  def main(args: Array[String]): Unit = {
    val lines = List("tie han han", "zai ye mei you guo ya")
    //先分步，再组合
    //1.步骤
    val list = lines.flatMap(_.split(" "))
    println("list=" + list)
    //2.步骤 => 做成一个对偶List => 才能分组并统计
    val list1: List[(String, Int)] = list.map((_, 1))
    println("list1=" + list1)
    //3.步骤 => 分组，把不同的单词归属到不同的组中
    val list2: Map[String, List[(String, Int)]] = list1.groupBy(_._1)
    println("list2=" + list2)
    //4.对上面的各个元祖，进行统计大小
    val list3: Map[String, Int] = list2.map(x => (x._1, x._2.size))
    println("list3=" + list3)
    //5.排序
    val list6: List[(String, Int)] = list3.toList.sortBy(_._2).reverse
    println("list6" + list6)

    //合并
    val result = lines.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).map(x => (x._1, x._2.size)).toList.sortBy(_._2).reverse
    println(result)
  }
}
