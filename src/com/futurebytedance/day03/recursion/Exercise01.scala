package com.futurebytedance.day03.recursion

/**
 * @author yuhang.sun
 * @date 2021/2/15 - 22:46
 * @version 1.0
 * @Description
 */
object Exercise01 {
  def main(args: Array[String]): Unit = {
    /*
    题1：给你一个整数n，求出它的斐波那契数是多少？ 1,1,2,3,5,8,13...,
     */
    println("斐波那契的结果=" + fbn(3))

    /*
    题2：求函数值 [演示] 已知 f(1)=3; f(n) = 2*f(n-1)+1; 请使用递归的思想编程，求出 f(n)的值
     */
    println(f(2)) //7

    /*
    题3：猴子吃桃子问题 有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！以后每天猴子都吃其中的一半，然后再多吃一个。当到第十天时，想再吃时（还没吃），发现只有1个桃子了。问题：最初共多少个桃子？

     分析思路：
     1.day=10 桃子有1
     2.day=9 桃子有 (day[10]+1)*2
     3.day=8 桃子有 (day[9]+1)*2
     */
    println("第1天有" + peach(1) + "个桃子")
  }

  def peach(n: Int): Int = {
    if (n == 10) {
      1
    } else {
      (peach(n + 1) + 1) * 2
    }
  }

  //题2就是简单的套用公式即可
  def f(n: Int): Int = {
    if (n == 1) {
      3
    } else {
      2 * f(n - 1) + 1
    }
  }

  //函数
  def fbn(n: Int): Int = {
    //分析
    //1.当n=1时，结果为1
    //2.当n=2 结果是1
    //3.当n>2时 结果就是前面两个数的和
    if (n == 1 || n == 2) {
      1
    } else {
      fbn(n - 1) + fbn(n - 2)
    }
  }


}
