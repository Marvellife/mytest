package com.xiancheng2.itheima_03;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/19 18:09
 */
public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket s1=new SellTicket();
        Thread t1=new Thread(s1,"窗口1");
        Thread t2=new Thread(s1,"窗口2");
        Thread t3=new Thread(s1,"窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
