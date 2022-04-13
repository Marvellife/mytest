package com.fanshe.itheima_07;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * 类功能描述
 *     利用反射向集合ArrayList<Integer>集合中插入字符串
 * @Author Administrator
 * @Date 2022/2/22 23:47
 */
public class Test01 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Class<? extends ArrayList> c = arrayList.getClass();
        Method add = c.getDeclaredMethod("add", Object.class);
        //反射可以越过泛型的检查，获取到原始的方法所需要的参数类型
        add.invoke(arrayList,"33");
        add.invoke(arrayList,"hello");
        add.invoke(arrayList,"world");
        System.out.println(arrayList);
        System.out.println("----------");
/*       //arrList中既有Integer又有String，所以要设定为Object
        for (Integer o:arrayList
             ) {
            System.out.println(o);
        }*/
        for (Object o:arrayList
        ) {
            System.out.println(o);
        }
    }
}
