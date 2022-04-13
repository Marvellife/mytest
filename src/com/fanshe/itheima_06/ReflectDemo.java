package com.fanshe.itheima_06;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 类功能描述
 * 反射获取成员方法
 *
 * @Author Administrator
 * @Date 2022/2/22 21:51
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c1 = Class.forName("com.fanshe.itheima_02.Student");
/*        //这个方法会返回这个类的所有公共方法，并且包括所有继承的方法
        Method[] methods = c1.getMethods();*/
        //这个方法会返回这个类的所有公共方法,不包括继承的
        Method[] methods = c1.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m);
        }
        System.out.println("----------------");
        //返回单个公共的
        Method method1 =  c1.getMethod("method1");
        //返回单个所有的成员方法
        Constructor<?> con = c1.getConstructor();
        Object o = con.newInstance();//获取对象
        method1.invoke(o);//调用对象的成员方法
    }
}
