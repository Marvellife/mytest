package com.jihe.itheima_16_04;

import java.util.HashSet;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/20 22:59
 */
public class HashSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<String> hashSet = new HashSet<String>();
        //添加元素
        hashSet.add("hello");
        hashSet.add("java");
        hashSet.add("world");
        hashSet.add("world");
        hashSet.add("重地");
        hashSet.add("通化");
        for(String s:hashSet){
            System.out.println(s);
        }

        System.out.println(hashSet);
    }
}
