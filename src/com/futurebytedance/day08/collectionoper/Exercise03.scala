package com.futurebytedance.day08.collectionoper

import scala.collection.mutable

/**
 * @author yuhang.sun
 * @date 2021/3/1 - 22:39
 * @version 1.0
 * @Description
 * val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD",使用映射集合，统计一句话中，各个字母出现的次数
 */
object Exercise03 {
  def main(args: Array[String]): Unit = {
    val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
    val map = sentence.foldLeft(Map[Char, Int]())(charCount)
    println(map)

    //使用可变的map，效率更高
    //1.先创建一个可变map,作为左折叠的第一个参数
    val map2 = mutable.Map[Char, Int]()
    val map3 = sentence.foldLeft(map2)(charCount2)
    println(map2)
    println(map3)
  }

  //使用不可变Map实现
  def charCount(map: Map[Char, Int], char: Char): Map[Char, Int] = {
    map + (char -> (map.getOrElse(char, 0) + 1))
  }

  //使用可变Map实现
  def charCount2(map: mutable.Map[Char, Int], c: Char): mutable.Map[Char, Int] = {
    map += (c -> (map.getOrElse(c, 0) + 1))
  }

}
