package com.xiancheng.itheima_04;

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
        m1.setName("高铁：");
        m2.setName("飞机：");
        m3.setName("汽车：");
        m1.start();
        m2.start();
        m3.start();
    }
}
