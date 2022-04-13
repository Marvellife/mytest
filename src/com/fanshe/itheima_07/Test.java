package com.fanshe.itheima_07;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/22 22:39
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        Student student = new Student();
        Class<?> c = Class.forName("com.fanshe.itheima_02.Student");
        Constructor<?> con = c.getConstructor();
        Object o = con.newInstance();
/*        //调用带参构造方法
        Object o1 = con.newInstance("林青霞",13,"西安");*/
//        student.method1;
        Method method1 = c.getDeclaredMethod("method1");
        method1.invoke(o);
//        student.method2("林青霞");
        Method method2 = c.getDeclaredMethod("method2", String.class);
        method2.invoke(o, "林青霞");
//        String ss = s.method3("林青霞",33);
        Method method3 = c.getDeclaredMethod("method3", String.class, int.class);
        String ss=method3.invoke(o, "林青霞",33).toString();
        System.out.println(ss);
        //student.function();
        Method function = c.getDeclaredMethod("function");
        function.setAccessible(true);
        function.invoke(o);
    }

}
