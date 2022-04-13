package com.lambda.itheima_02;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/20 23:21
 */
public class FlyableDemo {
    public static void main(String[] args) {
        //匿名内部类
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("真香");
            }
        });

        //lambda表达式
        useFlyable((String s)->{
            System.out.println(s);
            System.out.println("真好吃");
        });

    }


    public static void useFlyable(Flyable f){
        f.fly("吃粑粑了");
    }
}
