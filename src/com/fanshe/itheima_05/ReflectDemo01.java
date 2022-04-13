package com.fanshe.itheima_05;

import com.fanshe.itheima_02.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 类功能描述
 *      反射获取所有的成员
 * @Author Administrator
 * @Date 2022/2/22 21:51
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c = Class.forName("com.fanshe.itheima_02.Student");

//        Student student = new Student();
        Constructor<?> con = c.getConstructor();
        Object o = con.newInstance();
//        student.address="西安";
        Field addressField = c.getField("address");
        addressField.set(o,"西安");
        //私有的和默认的都需要通过getDeclaredField()获取
        Field nameField = c.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(o,"林青霞");
        Field ageField = c.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(o, 14);
        System.out.println(o);
    }
}
