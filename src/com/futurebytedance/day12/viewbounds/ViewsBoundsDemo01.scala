package com.futurebytedance.day12.viewbounds

/**
 * @author yuhang.sun
 * @date 2021/3/14 - 1:48
 * @version 1.0
 * @Description 视图
 */
object ViewsBoundsDemo01 {
  def main(args: Array[String]): Unit = {
    val compareComm1 = new CompareComm(20, 30) //
    println(compareComm1.greater)

    val compareComm2 = new CompareComm(Integer.valueOf(20), Integer.valueOf(30))
    println(compareComm2.greater)

    val compareComm4 = new CompareComm[java.lang.Float](201.9f, 30.1f)
    println(compareComm4.greater)
    //上面的小数比较，在视图界定的情况下，就可以这样写了
    //这里会进行隐式转换
    val compareComm5 = new CompareComm(201.9f, 310.1f)
    println(compareComm5.greater)
  }
}

/**
 * <% 视图界定 view bounds
 * 会发生隐式转换
 */
//说明
//1.T <% Comparable[T] 说明T是Comparable的子类型
//2.T <% Comparable[T]和T <: Comparable[T] 区别就是视图界定支持隐式转换
//3.视图界定不但支持以前上界的写法，同时支持简洁的写法 new CompareComm(201.9f, 310.1f)
class CompareComm[T <% Comparable[T]](obj1: T, obj2: T) {
  def greater: T = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}
