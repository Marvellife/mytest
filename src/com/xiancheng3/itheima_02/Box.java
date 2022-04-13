package com.xiancheng3.itheima_02;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/19 20:00
 */
public class Box {
    private int milk;
    private boolean state = false;

    public synchronized void put(int milk) {
        System.out.println("1put");
        if (state) {
            try {
                System.out.println("1wait");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk = milk;
        System.out.println("送奶工将第" + milk + "瓶奶放进奶箱");
        state = true;
        notifyAll();
        System.out.println("1notifyAll");
    }
    public synchronized void get() {
        System.out.println("2get");
        if (state==false){
            System.out.println("2wait");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            System.out.println("用户拿到第" + milk + "瓶奶");
            state=false;
            notifyAll();
        System.out.println("2notifyAll");
    }
}
