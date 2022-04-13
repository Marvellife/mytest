package com.fanshe.itheima_03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 类功能描述
 *  利用反射调用构造函数
 * @Author Administrator
 * @Date 2022/2/22 21:38
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c1 = Class.forName("com.fanshe.itheima_02.Student");
        Constructor<?> con = c1.getConstructor(String.class,int.class,String.class);
        Object o = con.newInstance("林青霞", 22, "西安");
        System.out.println(o);

    }
}
