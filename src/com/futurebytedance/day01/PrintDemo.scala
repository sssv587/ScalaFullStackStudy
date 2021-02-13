package com.futurebytedance.day01

/**
 * @author yuhang.sun
 * @date 2021/2/9 - 1:21
 * @version 1.0
 * @Description
 */
object PrintDemo {
  def main(args: Array[String]): Unit = {
    val str1: String = "hello"
    val str2: String = "world!"
    println(str1 + str2)

    val name = "tom"
    val age = 10
    val sal = 10.67f
    val height = 180.15
    //格式化输出
    printf("名字=%s 年龄是%d 薪水%.2f 身高%.2f\n", name, age, sal, height)

    //scala支持使用$输出内容，编译器会去解析$对应变量
    println(s"个人信息如下: 名字=$name 年龄=$age 薪水=$sal 身高=$height")
    //如果在字符串中出现了类似${age+10} 则表示{}是一个表达式
    println(s"个人信息如下: 名字=${name} 年龄=${age + 10} 薪水=${sal} 身高=${height * 100}")
  }
}
