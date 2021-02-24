package com.futurebytedance.day07.collection

import scala.collection.mutable.ArrayBuffer

/**
 * @author yuhang.sun
 * @date 2021/2/25 - 0:57
 * @version 1.0
 * @Description 变长数组
 * 1)ArrayBuffer是变长数组，类似java的ArrayList
 * 2)val arr2 = ArrayBuffer[Int]() 也是使用的apply方法构建对象
 * 3)def append(elems: A*) { appendAll(elems) } 接收的是可变参数.
 * 4)每append一次，arr在底层会重新分配空间，进行扩容，arr2的内存地址会发生变化，也就成为新的ArrayBuffer
 *
 */
object ArrayBufferDemo01 {
  def main(args: Array[String]): Unit = {
    //创建ArrayBuffer
    val arr01 = ArrayBuffer[Any](3, 2, 5)

    //访问，查询
    //通过下标访问元素
    println("arr01(1)=" + arr01(1))
    //遍历
    for (i <- arr01) {
      println(i)
    }
    println(arr01.length) //3
    println("arr01.hash=" + arr01.hashCode())

    //修改 [修改值，动态增加]
    //使用append追加数据，append支持可变参数
    //可以理解成java数组的扩容
    arr01.append(90.0, 13)
    println("arr01.hash=" + arr01.hashCode())
    arr01(1) = 89 //修改

    println("--------------------------")

    for (i <- arr01) {
      println(i)
    }

    //删除，是根据下标来说
    arr01.remove(0)

    println("--------------------------")

    for (i <- arr01) {
      println(i)
    }
    println("最新的长度=" + arr01.length)
  }
}
