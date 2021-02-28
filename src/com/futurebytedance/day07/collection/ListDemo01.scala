package com.futurebytedance.day07.collection

/**
 * @author yuhang.sun
 * @date 2021/2/28 - 16:08
 * @version 1.0
 * @Description List的使用
 * 1)List 在 scala包对象声明的,因此不需要引入其它包也可以使用
 * 2)val List = scala.collection.immutable.List
 * 3)List 中可以放任何数据类型，比如 arr1的类型为 List[Any]
 * 4)如果希望得到一个空列表，可以使用Nil对象, 在 scala包对象声明的,因此不需要引入其它包也可以使用val Nil = scala.collection.immutable.Nil
 *
 * 符号::表示向集合中  新建集合添加元素。
 * 运算时，集合对象一定要放置在最右边，
 * 运算规则，从右向左。
 * ::: 运算符是将集合中的每一个元素加入到集合中去
 */
object ListDemo01 {
  def main(args: Array[String]): Unit = {
    //说明
    //1.在默认情况下List是scala.collection.immutable.List，即不可变
    //2.在scala中，List就是不可变的，如需要使用可变的List，则使用ListBuffer
    //3.List在package object scala 做了 val list = scala.collection.immutable.List
    //4.val Nil = scala.collection.immutable.Nil // List()
    val list01 = List(1, 2, 3, "hello") //创建时，直接分配元素
    println(list01)
    val list02 = Nil //空集合
    println(list02)

    //访问List的元素
    val value1 = list01(1) //1是索引，表示取出第二个元素
    println("value1=" + value1) //2


    println("-------------list追加元素后的效果------------------------")
    //通过 :+ 和 +: 给list追加元素(本身集合并没有变化)
    val list1 = List(1, 2, 3, "abc")
    // :+运算符表示在列表的最后增加数据
    var list2 = list1 :+ 4
    println(list1) //list1没有变化
    println(list2) //新的列表结果是 [1, 2, 3, "abc", 4]

    // :+运算符表示在列表的最后增加数据
    list2 = 4 +: list1
    println(list1) //list1没有变化 List(1, 2, 3, abc) 说明List还是不可变
    println(list2) //新的列表结果是 [4, 1, 2, 3, "abc"]

    val list3 = 10 +: list1
    println(list1)
    println(list3)

    //::
    val list4 = List(1, 2, 3, "abc")
    //说明 val list5 = 4 :: 5 :: 6 :: list4 :: Nil 步骤
    //1.List()
    //2.List(List(1,2,3,"abc"))
    //3.List(6,List(1,2,3,"abc"))
    //4.List(5,6,List(1,2,3,"abc"))
    //5.List(4,5,6,List(1,2,3,"abc"))
    val list5 = 4 :: 5 :: 6 :: list4 :: Nil
    println(list5)

    //说明 val list5 = 4 :: 5 :: 6 :: list4 ::: Nil 步骤
    //1.List()
    //2.List(1,2,3,"abc")
    //3.List(6,1,2,3,"abc")
    //4.List(5,6,1,2,3,"abc")
    //5.List(4,5,6,1,2,3,"abc")
    val list6 = 4 :: 5 :: 6 :: list4 ::: Nil
    println(list6)
  }
}
