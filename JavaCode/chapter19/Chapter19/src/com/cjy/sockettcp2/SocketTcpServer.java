package com.cjy.sockettcp2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author cjy
 * @version 1.0
 */
public class SocketTcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器端已启动，正在监听9999端口....");
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        //转换流
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        //缓冲流
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String Line = bufferedReader.readLine();
        System.out.println(Line);


        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("hello, client");
        bufferedWriter.newLine();//插入一个换行符，表示写入的内容结束, 注意，要求对方使用 readLine()!!!!
        bufferedWriter.flush();// 如果使用的字符流，需要手动刷新，否则数据不会写入数据通道

        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();
    }
}
