package com.lambda.itheima_05;

/**
 * 类功能描述
 *                  引用静态方法
 * @Author Administrator
 * @Date 2022/2/21 22:46
 */
public class ConterDemo {
    public static void main(String[] args) {
        //匿名内部类
        useConverter(new Converter() {
            @Override
            public int convert(String s) {
                return Integer.parseInt(s);
            }
        });
        //lambda表达式
        useConverter(s->Integer.parseInt(s));
        //引用
        useConverter(Integer::parseInt);
    }

    public static void useConverter(Converter c){
        int num=c.convert("6666");
        System.out.println(num);
    }
}
