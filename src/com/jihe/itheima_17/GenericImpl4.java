package com.jihe.itheima_17;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/21 20:59
 */
public class GenericImpl4<T> implements Generic4<T>{


    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
