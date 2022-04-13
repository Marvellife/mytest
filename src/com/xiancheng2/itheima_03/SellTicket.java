package com.xiancheng2.itheima_03;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/19 18:04
 */
public class SellTicket extends Thread {
    private static int tickets = 100;
    private Object object = new Object();
    private int x = 0;

    @Override
    public void run() {
        while (true) {
            if (x % 2 == 0) {
//                synchronized (object) {
//                    synchronized (this) {         同步方法正常的用this锁
                synchronized (SellTicket.class) {//同步方法sellTeckets()用static修饰时，用这个锁。
                    if (tickets > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "正在售第" + tickets + "张票");
                        tickets--;
                    }
                }
            } else {
                /*synchronized (object) {
                    if (tickets > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "正在售第" + tickets + "张票");
                        tickets--;
                    }
                }*/
                sellTicket();
            }
            x++;
        }
    }

    private static synchronized void sellTicket() {
        if (tickets > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在售第" + tickets + "张票");
            tickets--;
        }
    }
}
