package sparkmasterworker.common

/**
 * @author yuhang.sun
 * @date 2021/3/9 - 23:55
 * @version 1.0
 * @Description
 */
// worker注册信息 //MessageProtocol.scala
case class RegisterWorkerInfo(id: String, cpu: Int, ram: Int)

//这个是WorkerInfo, 这个信息将来是保存在master的hashmap中的(该hashmap是用于管理worker)
//将来这个WorkerInfo扩展(比如增加worker上一次的心跳时间)
class WorkerInfo(val id: String, val cpu: Int, val ram: Int) {
  //新增
  var lastHeartBeat: Long = System.currentTimeMillis()
}

//当worker注册成功，服务器返回一个RegisteredWorkerInfo对象
case object RegisteredWorkerInfo

//worker每隔一段时间由定时器发给自己的一个消息
case object SendHeartBeat

//worker每隔一段时间由定时器触发，而向master发送的协议消息
case class HearBeat(id: String)

//master给自己发送一个触发检查超时worker的信息
case object StartTimeOutWorker
//master给自己发消息，检测worker,对于心跳超时的.
case object RemoveTimeOutWorker
