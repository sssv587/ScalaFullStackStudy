package com.futurebytedance.day12.upperbounds

/**
 * @author yuhang.sun
 * @date 2021/3/14 - 1:05
 * @version 1.0
 * @Description 上界
 */
object UpperBoundsDemo01 {
  def main(args: Array[String]): Unit = {
    //第一个用法
    val compareInt = new CompareInt(10, 40)
    println(compareInt.greater)

    //第二个用法
    val commonCompare = new CompareComm(Integer.valueOf(10), Integer.valueOf(40))
    println(commonCompare.greater)

    val commonCompare1 = new CompareComm(java.lang.Float.valueOf(10.1f), java.lang.Float.valueOf(40.1f))
    println(commonCompare1.greater)

    //第三种写法使用了隐式转换
    val commonCompare2 = new CompareComm[java.lang.Float](10.1f, 40.1f)
    println(commonCompare2.greater)
  }
}

/*
编写一个通用的类，可以进行Int之间、Float之间、等实现了Comparable接口的值直接的比较.//java.lang.Integer
分别使用传统方法和上界的方式来完成，体会上界使用的好处.
 */
class CompareInt(n1: Int, n2: Int) {
  //返回较大的值
  def greater: Int = if (n1 > n2) n1 else n2
}

//使用上界(上限)来完成
//1.[T <: Comparable[T]] 表示T类型是Comparable的子类型
//2.即传入的T类要继承Comparable接口
//3.这样就可以直接使用compareTo方法
//4.使用上界的写法的通用性比传统的要好
class CompareComm[T <: Comparable[T]](obj1: T, obj2: T) {
  def greater: T = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}