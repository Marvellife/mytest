package com.neibulei.itheima_07;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/16 18:58
 */
public class Other {
    private int num=10;
    public void show1(){
        System.out.println("外部类方法");
    }

    public class Inner{
        public void show(){
            System.out.println("内部类的成员方法");
            Other other=new Other();
            other.show1();
        }


    }
}
