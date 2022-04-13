package com.xiancheng.itheima_02;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/19 15:40
 */
public class MyThread extends Thread{
    public MyThread(){

    }
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            System.out.println(getName()+i);
        }
    }
}
