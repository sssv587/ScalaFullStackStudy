package com.futurebytedance.day07.collection

import scala.collection.mutable

/**
 * @author yuhang.sun
 * @date 2021/2/28 - 17:04
 * @version 1.0
 * @Description 队列的操作
 */
object QueueDemo {
  def main(args: Array[String]): Unit = {
    //创建队列
    val q1 = new mutable.Queue[Int]
    println(q1)

    //给队列增加元素
    q1 += 9
    println("q1=" + q1) // (9)
    q1 ++= List(4, 5, 7) // 默认直接加在队列后面
    println(q1) // (9,4,5,7)

    //q1 += List(10, 0) //表示将List(10,0)作为一个元素加入到队列中,

    //dequeue 从队列的头部取出元素 q1本身会变化
    val queueElement = q1.dequeue()
    println("queueElement=" + queueElement + " q1=" + q1)

    //enQueue 入队列，默认是从队列的尾部加入
    q1.enqueue(100, 10, 100, 888)
    println("q1=" + q1) //Queue(4, 5, 7, 100, 10, 100, 888)

    //队列 Queue-返回队列的元素
    //1.获取队列的第一个元素
    println(q1.head) // 4 对q1没有任何影响

    //2.获取队列的最后一个元素
    println(q1.last) // 888 对q1没有任何影响

    //3.取出队尾的数据，即：返回除了第一个以外剩余的元素，可以级联使用
    println(q1.tail.tail.tail.tail) //Queue(10, 100, 888)
  }
}
