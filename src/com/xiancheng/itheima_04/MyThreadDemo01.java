package com.xiancheng.itheima_04;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/19 15:40
 */
public class MyThreadDemo01 {
    public static void main(String[] args) {
        MyThread01 m1=new MyThread01();
        MyThread01 m2=new MyThread01();
        m1.setName("关羽:");
        m2.setName("张飞:");
        //设置刘备为主线程
        Thread.currentThread().setName("刘备");
        m1.setDaemon(true);//设置关羽和张飞为守护线程，当主线程执行完毕时，守护线程需要很快的停止执行（不是立即停止）
        m2.setDaemon(true);
        m1.start();
        m2.start();
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
