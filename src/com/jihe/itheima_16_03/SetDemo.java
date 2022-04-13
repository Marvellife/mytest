package com.jihe.itheima_16_03;

import java.util.HashSet;
import java.util.Set;

/**
 * 类功能描述
 * Set集合特点
 * 不包含重复元素，
 * 没有带索引的方法，所以不能用普通for循环遍历
 * HashSet 对集合的迭代顺序不作任何保证
 *
 * @Author Administrator
 * @Date 2022/1/20 22:21
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("hello");
        set.add("world");
        set.add("java");

        for(String s:set){
            System.out.println(s);
        }
    }
}