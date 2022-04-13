package com.xiancheng.itheima_01.itheima_01;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/19 15:40
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            System.out.println(i);
        }
    }
}
