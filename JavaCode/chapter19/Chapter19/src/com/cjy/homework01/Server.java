package com.cjy.homework01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author cjy
 * @version 1.0
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器端已启动....");
        Socket socket = serverSocket.accept();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = bufferedReader.readLine();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        if (s.equals("name")) {
            bufferedWriter.write("我是nova");
        } else if (s.equals("hobby")) {
            bufferedWriter.write("编写java程序");
        } else {
            bufferedWriter.write("你说啥？");
        }
        bufferedWriter.newLine();
        bufferedWriter.flush();

        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        serverSocket.close();
    }
}

