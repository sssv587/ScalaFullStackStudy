package com.futurebytedance.day11.remotecandymachine.client

import java.rmi.Naming

import com.futurebytedance.day11.remotecandymachine.server.CandyMachineRemote




object TestRemoteMachine {
  def main(args: Array[String]): Unit = {
    val mMonitor = new Monitor()

    try {
      //通过rmi获取到远程的糖果机
      val mCandyMachine = Naming.lookup("rmi://127.0.0.1:6602/candymachine1").asInstanceOf[CandyMachineRemote]
      mMonitor.addMachine(mCandyMachine)

    } catch {
      case ex: Exception => ex.printStackTrace()
    }

    mMonitor.report()
  }
}
