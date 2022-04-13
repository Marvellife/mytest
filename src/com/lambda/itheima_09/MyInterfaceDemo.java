package com.lambda.itheima_09;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/22 19:52
 */
public class MyInterfaceDemo {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
            @Override
            public void show() {
                System.out.println("函数式接口1");
            }
        };
        myInterface.show();

        MyInterface myInterface1 = ()-> System.out.println("函数式接口2");
        myInterface1.show();
    }
}
