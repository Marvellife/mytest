package com.jihe.itheima_16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/18 22:50
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        //添加元素 boolean add(E e)
        c.add("hello");//始终返回true
        c.add("world");
        c.add("java");
        //Iterator<E> iterator;返回此集合中元素的迭代器，通过集合的iterator()方法得到
        Iterator<String>    iterator=c.iterator();
        while(iterator.hasNext()){
            String s=iterator.next();//未免拿到数据之后要做其他操作，可以先赋值
            System.out.println(s);
        }


    }
}
