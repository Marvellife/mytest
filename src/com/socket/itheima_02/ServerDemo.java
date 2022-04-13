package com.socket.itheima_02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/20 21:36
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(10000);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        String data = new String(bytes,0,len);
        System.out.println("服务器说："+data);
        //给出反馈
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("数据已经收到了".getBytes());
        socket.close();
        serverSocket.close();
    }

}
