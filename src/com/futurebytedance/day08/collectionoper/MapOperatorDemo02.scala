package com.futurebytedance.day08.collectionoper

/**
 * @author yuhang.sun
 * @date 2021/2/28 - 23:38
 * @version 1.0
 * @Description map操作
 */
object MapOperatorDemo02 {
  def main(args: Array[String]): Unit = {
    /*
   要求：请将List(3,5,7) 中的所有元素都 * 2 ，将其结果放到一个新的集合中返回，即返回一个新的List(6,10,14), 请编写程序实现.
    */
    val list = List(3, 5, 7)
    //说明 list.map(multiple)做了什么
    //1.将list这个集合的元素 依次遍历
    //2.将各个元素传递给multiple 函数 => 新Int
    //3.将得到新Int，放入到一个新的结合并返回
    //4.因此multiple函数调用3次
    val list2 = list.map(multiple)
    println("list2=" + list2)


    //深刻理解map映射函数的机制-模拟实现
    val myList = MyList()
    val myList1 = myList.map(multiple)
    println("myList1=" + myList1)
  }

  def multiple(n: Int): Int = {
    println("multiple 被调用")
    n * 2
  }
}

//深刻理解map映射函数的机制-模拟实现
class MyList {
  val list1 = List(3, 5, 7, 9)
  //新的集合
  var list2: List[Int] = List[Int]()

  //写map
  def map(f: Int => Int): List[Int] = {
    //遍历集合
    for (item <- list1) {
      list2 = list2 :+ f(item)
    }
    list2
  }
}

object MyList {
  def apply(): MyList = new MyList()
}