package com.cjy.sockettcp2;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;


/**
 * @author cjy
 * @version 1.0
 */
public class SocketTcpClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);

        OutputStream outputStream = socket.getOutputStream();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        bufferedWriter.write("Hello, Server");
        bufferedWriter.newLine();//插入一个换行符，表示写入的内容结束, 注意，要求对方使用 readLine()!!!!
        bufferedWriter.flush();// 如果使用的字符流，需要手动刷新，否则数据不会写入数据通道

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String Line = bufferedReader.readLine();
        System.out.println(Line);

        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
    }
}
