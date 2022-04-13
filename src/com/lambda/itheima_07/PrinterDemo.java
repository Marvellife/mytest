package com.lambda.itheima_07;

/**
 * 类功能描述
 *      引用类的实例方法
 * @Author Administrator
 * @Date 2022/2/21 23:00
 */
public class PrinterDemo {
    public static void main(String[] args) {
        //匿名内部类
        useMyString(new MyString() {
            @Override
            public String mySubString(String s, int x, int y) {
                return s.substring(x,y);
            }
        });
        //lambda表达式
        useMyString((String s,int x,int y)->{return s.substring(x,y);});
        //lambda表示式优化
        useMyString((s,x,y)->s.substring(x,y));
        //引用实例方法
        useMyString(String::substring);
        //lambda表达式被类的实例方法替代的时候
        //第一个参数作为调用者
        //后面的参数全部传递给方法作为参数
    }
    public static void useMyString(MyString myString){
        System.out.println(myString.mySubString("abcdefgh",2,6));
    }

}