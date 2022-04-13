package com.fanshe.itheima_04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 类功能描述
 *          反射获取私有构造方法创建对象
 * @Author Administrator
 * @Date 2022/2/22 21:38
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c1 = Class.forName("com.fanshe.itheima_02.Student");
        Constructor<?> con = c1.getDeclaredConstructor(String.class);
/*        //私有的构造方法创建对象是不被允许的，报错
        Object o = con.newInstance("林青霞");*/
        //私有的构造方法，要进行暴力反射
        con.setAccessible(true);
        Object o = con.newInstance("林青霞");
        System.out.println(o);

    }
}
