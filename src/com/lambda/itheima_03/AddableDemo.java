package com.lambda.itheima_03;


/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/20 23:35
 */
public class AddableDemo {
    public static void main(String[] args) {
        //匿名内部类
        useAddable(new Addable() {
            @Override
            public int add(int x, int y) {
                test();
                return x+y;
            }
        });


        System.out.println("----------------------");
        //lambda表达式，参数类型可以省略，但是多个参数时需要同时省略，或者都不省略,
        // 如果参数只有一个括号也可以省略
//        useAddable((int x,int y)->{
           useAddable((x,y)->{
            //test();不可以直接调用默认方法，但是可以通过创建的对象调用(ps：只适用于普通类，接口不能创建对象)

            return x+y;
        });



        useAddable((x,y)->x+y);

        useAddable(new Addable() {
            @Override
            public int add(int x, int y) {
                return x+y;
            }
        });


    }
    public  static void useAddable(Addable addable){

        System.out.println(addable.add(3,5 ));
    }
}
