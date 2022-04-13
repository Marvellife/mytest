package com.duotai.itheima_05;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/15 19:09
 */
public class Fu {
    private void show1(){
        System.out.println("private");
    }
    void show2(){

        System.out.println("默认");
    }
    protected void show3(){

        System.out.println("protected");
    }
    public void show4(){

        System.out.println("public");
    }
    public static void show(){
        Fu fu = new Fu();
        fu.show1();
        fu.show2();
        fu.show3();
        fu.show4();
    }

}
