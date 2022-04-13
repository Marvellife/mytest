package com.lambda.itheima_01;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/20 23:02
 */
public class EatableDemo {
    public static void main(String[] args) {
        Eatable eatable = new EatableImpl();
        useEatable(eatable);

        //匿名内部类
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("又吃饭饭了");
            }
        });
        //lambda表达式
        /*
        * new Eatable()缩写为()
        * 其他部分缩写为->{}
        * 然后加上内部的实现语句
        *
        * */
        useEatable(()->{
            System.out.println("吃吃饭饭了！");
        });
    }


    public static void useEatable(Eatable eatable) {
        eatable.eat();
    }
}
