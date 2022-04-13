package com.socket.itheima_01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/20 19:41
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress addresses = InetAddress.getByName("192.168.1.4");
        System.out.println("主机名："+addresses.getHostAddress());
        System.out.println("ip："+addresses.getHostAddress());

    }
}
