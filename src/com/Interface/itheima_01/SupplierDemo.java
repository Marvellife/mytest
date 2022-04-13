package com.Interface.itheima_01;

import java.util.function.Supplier;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/22 20:22
 */
public class SupplierDemo {
    public static void main(String[] args) {
        String s = getString(() -> "林青霞");
        System.out.println(s);
        Integer i = getInteger(() -> 111);
        System.out.println(i);
    }

    //定义一个方法，返回一个整数数据
    private static Integer getInteger(Supplier<Integer> integerSupplier) {
        return integerSupplier.get();
    }

    //定义一个方法，返回一个字符串数据
    private static String getString(Supplier<String> stringSupplier) {
        return stringSupplier.get();
    }
}
