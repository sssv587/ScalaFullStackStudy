package com.futurebytedance.day05

/**
 * @author yuhang.sun
 * @date 2021/2/21 - 18:39
 * @version 1.0
 * @Description
 */
object ChildJoinGame {
  def main(args: Array[String]): Unit = {
    val child0 = new Child02("白骨精")
    val child1 = new Child02("蜘蛛精")
    val child2 = new Child02("黄鼠狼精")
    Child02.joinGame(child0)
    Child02.joinGame(child1)
    Child02.joinGame(child2)
    Child02.showNum()
  }
}

class Child02(cName: String) {
  var name: String = cName
}

object Child02 {
  //统计共有小孩的属性
  var totalChildNumber = 0

  def joinGame(child: Child02): Unit = {
    printf("%s 小孩加入了游戏\n", child.name)
    //totalChildNumber 加1
    totalChildNumber += 1
  }

  def showNum(): Unit = {
    printf("当前有%d个小孩玩游戏", totalChildNumber)
  }
}
