package com.socket.itheima_02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.SocketHandler;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/20 21:31
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.1.4", 10000);
        OutputStream outputStream = s.getOutputStream();
        outputStream.write("hello,我来了".getBytes());

        //接收反馈
        InputStream inputStream = s.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        String data = new String(bytes, 0, len);
        System.out.println("客户端：" + data);
        s.close();
    }
}
