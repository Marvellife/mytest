package com.fanshe.itheima_02;

import java.lang.reflect.Constructor;

/**
 * 类功能描述
 *  通过反射获取构造方法
 * @Author Administrator
 * @Date 2022/2/22 21:18
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Class<?> c4 = Class.forName("com.fanshe.itheima_02.Student");
/*        //只能获取到公共的构造方法，默认的和私有的拿不到
        Constructor<?>[] cons = c4.getConstructors();*/
/*        //可以获取所有的构造方法
        Constructor<?>[] cons = c4.getDeclaredConstructors();
        for (Constructor con:cons
             ) {
            System.out.println(con);
        }
        System.out.println("-------------------");*/
        //返回单个的公共的构造方法
        Constructor<?> con = c4.getConstructor();
        System.out.println(c4);
        Object o = c4.newInstance();
        System.out.println(o);
        //返回所有中的一个
        Constructor<?> dec = c4.getDeclaredConstructor();
    }
}
