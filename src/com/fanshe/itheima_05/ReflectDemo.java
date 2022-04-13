package com.fanshe.itheima_05;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 类功能描述
 *      反射获取成员
 * @Author Administrator
 * @Date 2022/2/22 21:51
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c1 = Class.forName("com.fanshe.itheima_02.Student");
/*       //获取公共的的所有的
        Field[] fields = c1.getFields();*/
        //获取所有的
        Field[] fields = c1.getDeclaredFields();
        for (Field f :
                fields) {
            System.out.println(f);
        }
        System.out.println("-----------");

        //获取单个的公共的
        //利用反射完成以下
/*        Student student = new Student();
        student.address="西安";
        System.out.println(student);*/

        //Student student = new Student();
        Constructor<?> con = c1.getConstructor();
        Object o = con.newInstance();

        //student.address="西安";
        Field addressField = c1.getField("address");
        addressField.set(o,"西安");

        System.out.println(o);
    }
}
