package com.xiancheng.itheima_01.itheima_01;

import com.xiancheng.itheima_02.MyThread;

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
        m1.start();
        m2.start();
        //run()方法并没有启动线程。直接调用run（）方法，相当于调用了一个普通fangfa
        //start()方法，是启动线程，然后由jvm调用此线程的run（）方法
    }
}
