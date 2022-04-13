package com.neibulei.itheima_07;

/**
 * 类功能描述
 * 内部类的测试类
 *
 * @Author Administrator
 * @Date 2022/1/16 18:58
 */
public class InnerDemo {
    public static void main(String[] args) {
        //创建内部类方法并调用方法
        Other.Inner s= new Other().new Inner();
        s.show();
        Other o=new Other();
        o.show1();
    }
}
