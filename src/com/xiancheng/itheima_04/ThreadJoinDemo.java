package com.xiancheng.itheima_04;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/19 15:40
 */
public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadJoin m1=new ThreadJoin();
        ThreadJoin m2=new ThreadJoin();
        ThreadJoin m3=new ThreadJoin();
        m1.setName("高铁");
        m2.setName("飞机");
        m3.setName("汽车");
        m1.start();
        //m1.join();//等待这个线程执行完毕，在执行其他的线程
        m2.start();
        m3.start();
    }
}
