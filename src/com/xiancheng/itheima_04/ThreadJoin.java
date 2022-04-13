package com.xiancheng.itheima_04;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/19 15:40
 */
public class ThreadJoin extends Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(getName()+":"+i);
        }
    }
}
