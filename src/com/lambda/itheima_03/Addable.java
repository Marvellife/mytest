package com.lambda.itheima_03;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/20 23:35
 */
public interface Addable {
    int add(int x,int y);
    public default void test(){
        System.out.println("cccc");
    }
}
