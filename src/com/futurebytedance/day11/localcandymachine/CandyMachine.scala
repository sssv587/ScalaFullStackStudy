package com.futurebytedance.day11.localcandymachine

//糖果机状态..
class CandyMachine {

  var mSoldOutState: State = _
  var mOnReadyState: State = _
  var mHasCoin: State = _
  var mSoldState: State = _
  var mWinnerState: State = _
  private var location = ""
  private var state: State = _
  private var count = 0

  def this(location: String, count: Int) {
    this
    this.location = location
    this.count = count
    mSoldOutState = new SoldOutState(this);
    mOnReadyState = new OnReadyState(this);
    mHasCoin = new HasCoin(this);
    mSoldState = new SoldState(this);
    mWinnerState = new WinnerState(this);
    if (count > 0) {
      state = mOnReadyState;
    } else {
      state = mSoldOutState;
    }
  }

  //给糖果机设置状态
  def setState(state: State): Unit = {
    this.state = state
  }

  def getLocation(): String = {
    location
  }


  def insertCoin(): Unit = {
    state.insertCoin()
  }

  def returnCoin(): Unit = {
    state.returnCoin()
  }

  def turnCrank(): Unit = {
    state.turnCrank()
    state.dispense()
  }

  def releaseCandy(): Unit = {

    if (count > 0) {
      count = count - 1
      println("a candy rolling out!");
    }

  }

  def getCount(): Int = {
    count
  }

  def printstate() = {
    state.printstate()
  }

  def getstate(): State = {
    state
  }
}
