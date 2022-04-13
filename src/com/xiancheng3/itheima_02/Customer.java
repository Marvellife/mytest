package com.xiancheng3.itheima_02;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/19 20:01
 */
public class Customer implements Runnable{
    private Box box;
    public Customer(Box box) {
        this.box=box;
    }

    @Override
    public void run() {
        while (true){
            box.get();
        }
    }
}
