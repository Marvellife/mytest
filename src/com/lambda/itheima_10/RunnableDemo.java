package com.lambda.itheima_10;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/22 20:00
 */
public class RunnableDemo {
    public static void main(String[] args) {
         startThread(new Runnable() {
             @Override
             public void run() {
                 System.out.println(Thread.currentThread().getName()+"线程启动了");
             }
         });

         startThread(()-> System.out.println(Thread.currentThread().getName()+"线程启动了2"));

    }
    public static void startThread(Runnable runnable){
       /* Thread t = new Thread(runnable);
        t.start();*/
        new Thread(runnable).start();
    }
}
