package com.xiancheng2.itheima_02;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/19 18:04
 */
public class SellTicket extends Thread {
    private  int  tickets = 100;
    private Object object=new Object();
    @Override
    public  void run() {
        while (true) {
            synchronized (object){
            if (tickets > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在售第" + tickets + "张票");
                tickets--;
            }
            else {
                System.out.println("票卖完了");
                break;
            }
        }}
    }
}
