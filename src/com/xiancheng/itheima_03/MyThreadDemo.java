package com.xiancheng.itheima_03;
/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/19 15:40
 */
public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread m1=new MyThread();
        MyThread m2=new MyThread();
        MyThread m3=new MyThread();
        m1.setName("高铁");
        m2.setName("飞机");
        m3.setName("汽车");
        //设置线程的优先级，默认都是5，最大可以设置10，最小为1，线程的优先级高只是获取cpu时间片的几率更高
        m1.setPriority(5);
        m2.setPriority(10);
        m3.setPriority(1);
        System.out.println(m1.getPriority());
        System.out.println(m2.getPriority());
        System.out.println(m3.getPriority());
        m1.start();
        m2.start();
        m3.start();
    }
}
