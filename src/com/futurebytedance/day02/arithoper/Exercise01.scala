package com.futurebytedance.day02.arithoper

/**
 * @author yuhang.sun
 * @date 2021/2/14 - 23:23
 * @version 1.0
 * @Description 算术运算符
 */
object Exercise01 {
  def main(args: Array[String]): Unit = {
    /*
    假如还有97天放假，问：xx个星期零xx天
    1.搞清楚需求(读题)
    2.思路分析
    (1)变量保存97
    (2)使用 /7 得到几个星期
    (3)xx天使用 %
    3.代码实现
     */
    val days = 97
    printf("统计的结果是 %d个星期零%d天", days / 7, days % 7)

    /*
    定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为：5/9*(华氏温度-100),请求出华氏温度对应的
摄氏温度
    分析
    1.变量保存华氏温度，变量保存摄氏问题
    2.公式有，就直接套用
     */
    println()
    val huashi = 232.5
    val sheshi = 5.0 / 9 * (huashi - 100)
    println("对应的摄氏温度:" + sheshi.formatted("%.2f"))
  }
}
