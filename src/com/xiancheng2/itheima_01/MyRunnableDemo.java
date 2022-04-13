package com.xiancheng2.itheima_01;

import com.xiancheng.itheima_02.MyThread;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/19 15:40
 */
public class MyRunnableDemo {
    public static void main(String[] args) {
        //默认构造方法
        /*MyRunnable m1=new MyRunnable();
        MyRunnable m2=new MyRunnable();
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        t1.setName("刘备");
        t2.setName("关羽");
        t1.start();
        t2.start();*/
        //run()方法并没有启动线程。直接调用run（）方法，相当于调用了一个普通fangfa
        //start()方法，是启动线程，然后由jvm调用此线程的run（）方法
        //带两个参数的构造方法
        MyRunnable m1=new MyRunnable();
        MyRunnable m2=new MyRunnable();
        Thread t1 = new Thread(m1,"刘备");
        Thread t2 = new Thread(m2,"关羽");
        t1.start();
        t2.start();
    }
}
