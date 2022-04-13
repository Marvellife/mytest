package com.jihe.itheima_16;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/18 21:35
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        //创建collection集合对象ArrayList存储元素可重复
        Collection<String> c = new ArrayList<>();
        int studentName;
        //添加元素 boolean add(E e)
        c.add("hello");//始终返回true
        c.add("world");
        c.add("java");
        c.add("java");
        System.out.println(c.add("world"));
        int a = 100;
        System.out.println(c);//输出[hello, world, java]，说明ArrayList重写了toString()

    }
}
