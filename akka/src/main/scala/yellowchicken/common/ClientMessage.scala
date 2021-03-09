package yellowchicken.common

/**
 * @author yuhang.sun
 * @date 2021/3/9 - 22:45
 * @version 1.0
 * @Description
 */
//使用样例类来构建协议
//客户端发送服务器协议(序列化的对象)
case class ClientMessage(mes: String) {}

//服务器端发送给客户端的协议(样例类对象)
case class ServerMessage(mes:String){}
