package com.socket.itheima_01;

import java.io.IOException;
import java.net.*;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/20 20:04
 */
public class SemdDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端的socket对象
        DatagramSocket ds = new DatagramSocket();
        byte[] bytes = "hello,udp,我来了".getBytes();
//        int lenth = bytes.length;
//        InetAddress inetAddress=InetAddress.getByName("192.168.1.4");
//        int port = 10086;
//        DatagramPacket dp=new DatagramPacket(bytes,lenth,inetAddress,port);
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length,InetAddress.getByName("192.168.1.4"),10086);
        ds.send(dp);
        ds.close();


    }
}
