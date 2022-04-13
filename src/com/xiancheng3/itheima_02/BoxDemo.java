package com.xiancheng3.itheima_02;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/19 20:01
 */
public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box();

        Producer producer=new Producer(box);
        Customer customer= new Customer(box);

        Thread t1=new Thread(producer);
        Thread t2= new Thread(customer);

        t1.start();
        t2.start();
    }
}
