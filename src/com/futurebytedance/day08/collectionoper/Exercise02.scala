package com.futurebytedance.day08.collectionoper

import scala.collection.mutable.ArrayBuffer

/**
 * @author yuhang.sun
 * @date 2021/3/1 - 22:27
 * @version 1.0
 * @Description
 * val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD",将sentence中各个字符，通过foldLeft存放到一个ArrayBuffer中,目的：理解flodLeft的用法.
 */
object Exercise02 {
  def main(args: Array[String]): Unit = {
    val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
    val arr = ArrayBuffer[Char]()
    //理解折叠的第一个传入的参数ArrayBuffer的含义
    sentence.foldLeft(arr)(putArr)
    println("arrayBuffer=" + arr)
  }

  def putArr(arr: ArrayBuffer[Char], c: Char): ArrayBuffer[Char] = {
    arr.append(c)
    arr
  }
}
