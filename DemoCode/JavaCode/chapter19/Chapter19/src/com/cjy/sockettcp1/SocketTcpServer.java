package com.cjy.sockettcp1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author cjy
 * @version 1.0
 */
public class SocketTcpServer {
    public static void main(String[] args) throws IOException {
        //1. 在本机 的 9999 端口监听, 等待连接
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端，在9999端口监听，等待连接");

        //2. 当没有客户端连接 9999 端口时，程序会 阻塞, 等待连接
        Socket socket = serverSocket.accept();
        System.out.println("服务器 socket = " + socket.getClass());

        //3. 通过 socket.getInputStream() 读取客户端写入到数据通道的数据, 显示
        InputStream inputStream = socket.getInputStream();

        //4. IO 读取
        byte[] bytes = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,readLen));
        }

        //5. 通过输出流，写入数据到 数据通道
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello, client".getBytes());
        socket.shutdownOutput();// 设置结束标记

        //6.关闭流和 socket
        outputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务器端退出....");
    }
}
