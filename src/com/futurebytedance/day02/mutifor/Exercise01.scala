package com.futurebytedance.day02.mutifor

import scala.io.StdIn

/**
 * @author yuhang.sun
 * @date 2021/2/15 - 3:48
 * @version 1.0
 * @Description
 */
object Exercise01 {
  def main(args: Array[String]): Unit = {
    /*
    1.统计三个班成绩情况，每个班有5名同学，求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。
    分析思路
    (1)classNum表示班级个数，stuNum表示学生个数
    (2)classScore表示各个班级总分 totalScore 表示所有班级总分
    (3)score 表示各个学生成绩
    (4)使用循环的方式输入成绩

    2.统计三个班及格人数，每个班有5名同学。
    3.打印出九九乘法表

     */
    val classNum = 3
    val stuNum = 5
    var score = 0.0 //分数
    var classScore = 0.0 //班级的总分
    var totalScore = 0.0 //所有班级总分
    var passNum = 0 //统计及格人数
    for (i <- 1 to classNum) {
      //先将classScore清0
      classScore = 0.0
      for (j <- 1 to stuNum) {
        println(s"请输入第${i}班级的第${j}个学生的成绩")
        score = StdIn.readDouble()
        if (score >= 60) {
          passNum += 1
        }
        classScore += score
      }
      //累计 totalScore
      totalScore += classScore
      printf("第%d班级的平均分为%.2f", i, classScore / stuNum)
    }
    printf("所有班级的平均分为%.2f\n", totalScore / (classNum * stuNum))
    printf("所有班级的及格人数为%d", passNum)
  }
}
