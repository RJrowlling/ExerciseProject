package com.cjy.sockettcp1;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author cjy
 * @version 1.0
 */
public class SocketTcpClient {
    public static void main(String[] args) throws IOException {
        //1. 连接服务端 (ip , 端口）
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        System.out.println("客户端 socket 返回=" + socket.getClass());

        //2. 连接上后，生成 Socket, 通过 socket.getOutputStream,得到 和 socket 对象关联的输出流对
        OutputStream outputStream = socket.getOutputStream();

        //3. 通过输出流，写入数据到 数据通道
        outputStream.write("hello, server".getBytes());
        socket.shutdownOutput();// 设置结束标记

        //4. 通过输入流，从 数据通道 读取数据
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int readLen;
        while ((readLen = inputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,readLen));
        }

        //5. 关闭流对象和 socket, 必须关闭
        inputStream.close();
        outputStream.close();
        socket.close();
        System.out.println("客户端退出.....");
    }
}
