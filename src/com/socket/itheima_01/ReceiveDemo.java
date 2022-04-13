package com.socket.itheima_01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/20 20:31
 */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        ds.receive(dp);
        byte[] datas = dp.getData();
/*        int len = dp.getLength();
        String dataString = new String(datas,0,len);
        System.out.println("数据是："+dataString);*/
        System.out.println("数据是："+new String(datas,0,dp.getLength()));
        System.out.println("1111111111111111");
        ds.close();
    }
}
