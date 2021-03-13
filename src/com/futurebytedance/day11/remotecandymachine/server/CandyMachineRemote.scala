package com.futurebytedance.day11.remotecandymachine.server

import java.rmi.{Remote, RemoteException}

trait CandyMachineRemote extends Remote {

  @throws(classOf[RemoteException])
  def getLocation(): String

  @throws(classOf[RemoteException])
  def getCount(): Int

  @throws(classOf[RemoteException])
  def getstate(): State
}