package com.xiancheng.itheima_02;


/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/19 15:40
 */
public class MyThreadDemo extends Thread{
    public static void main(String[] args) {

        //返回当前正在执行的线程对象的引用
        System.out.println(Thread.currentThread().getName());
        //main方法就是在线程名为main的线程中执行的


        /*
        //无参构造方法
        MyThread02 m1=new MyThread02();
        MyThread02 m2=new MyThread02();
        m1.setName("线程1：");
        m2.setName("线程2：");
        m1.start();
        m2.start();*/
        //run()方法并没有启动线程。直接调用run（）方法，相当于调用了一个普通fangfa
        //start()方法，是启动线程，然后由jvm调用此线程的run（）方法

        //带参构造方法
        MyThread m1 = new MyThread("线程1：");
        MyThread m2 = new MyThread("线程2：");
        m1.start();
        m2.start();
    }
}
