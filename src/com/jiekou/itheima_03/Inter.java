package com.jiekou.itheima_03;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/21 22:14
 */
public interface Inter {

    int a=100;
     void test();
    default void show1(){
        System.out.println(a);
        System.out.println("show1开始");
        show();

        System.out.println("show1结束");
    }
    default void show2(){
        System.out.println("show2开始");
        show();
        System.out.println("show2结束");
    }

    static void show(){
        System.out.println("ccccc");
        System.out.println(a);
    }
    //1.9后可以使用
    /*
    private void show(){
        System.out.println("私有方法");
    }*/
}
