package com.socket.itheima_01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/20 20:04
 */
public class SemdDemo01 {
    public static void main(String[] args) throws IOException {
        //创建发送端的socket对象
        DatagramSocket ds = new DatagramSocket();
        byte[] bytes=new byte[1024];
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        while(s!=null&&!"886".equals(s)){
            bytes=s.getBytes();
            DatagramPacket dp=new DatagramPacket(bytes,bytes.length,InetAddress.getByName("192.168.1.4"),12341);
            ds.send(dp);
            s=null;
            s=scanner.nextLine();
        }
        ds.close();


    }
}
