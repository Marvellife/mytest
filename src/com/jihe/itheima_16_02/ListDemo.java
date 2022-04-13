package com.jihe.itheima_16_02;

import java.util.ArrayList;
import java.util.List;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/18 23:41
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");
        //  list集合有序可重复，带有索引，在用索引操作时，注意不要索引越界，报错
        list.remove(2);
        list.add(2, "33");
        list.set(1, "wwww");
        System.out.println(list.get(1));
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //增强for循环，底层就是迭代器
        for(String j:list){
            System.out.println(j);
        }
    }
}
