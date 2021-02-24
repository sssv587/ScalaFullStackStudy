package com.futurebytedance.day07.collection

import scala.collection.mutable.ArrayBuffer

/**
 * @author yuhang.sun
 * @date 2021/2/25 - 1:15
 * @version 1.0
 * @Description 定长数组与变长数组的转换
 * arr1.toBuffer  //定长数组转可变数组
 * arr2.toArray  //可变数组转定长数组
 */
object Array22ArrayBuffer {
  def main(args: Array[String]): Unit = {
    val arr2 = ArrayBuffer[Int]()
    // 追加值
    arr2.append(1, 2, 3)
    println(arr2)

    //说明
    //1.arr2.toArray调用arr2的方法 toArray
    //2.将ArrayBuffer ---> Array
    //3.arr2本身没有任何变化
    val newArr = arr2.toArray;
    println(newArr.mkString("Array(", ", ", ")"))

    //说明
    //1.newArr.toBuffer是把Array转成ArrayBuffer
    //2.底层的实现
    /*
    override def toBuffer[A1 >: A]: mutable.Buffer[A1] = {
    val result = new mutable.ArrayBuffer[A1](size)
    copyToBuffer(result)
    result
  }
     */
    //3.newArr本身没变化
    val newArr2 = newArr.toBuffer
    newArr2.append(123)
    println(newArr2)
  }
}
