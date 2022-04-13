package com.fanshe.itheima_01;

import com.fanshe.itheima_02.Student;

/**
 * 类功能描述
 *  反射获取对象
 * @Author Administrator
 * @Date 2022/2/22 21:00
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<Student> c1 = Student.class;
        System.out.println(c1);

        Class<Student> c2 = Student.class;
        System.out.println(c1==c2);//true
        System.out.println("------------------");

        Student s = new Student();
        Class<? extends Student> c3 = s.getClass();
        System.out.println(c1==c3);
        System.out.println("----------------");

        Class<?> c4 = Class.forName("com.fanshe.itheima_02.Student");
        System.out.println(c1==c4);
    }
}
