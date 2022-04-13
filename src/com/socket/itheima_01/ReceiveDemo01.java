package com.socket.itheima_01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/20 20:31
 */
public class ReceiveDemo01 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(12341);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        ds.receive(dp);
        byte[] datas = dp.getData();
       int len = dp.getLength();
        String dataString = new String(datas,0,len);
        while (true){
            System.out.println("数据是："+dataString);
            dataString=null;
            ds.receive(dp);
            datas = dp.getData();
            len = dp.getLength();
            dataString = new String(datas,0,len);
        }
    }
}
