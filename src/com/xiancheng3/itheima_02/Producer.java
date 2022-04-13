package com.xiancheng3.itheima_02;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/19 20:02
 */
public class Producer implements Runnable{
    private Box box;
    public Producer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            box.put(i);
        }
    }
}
