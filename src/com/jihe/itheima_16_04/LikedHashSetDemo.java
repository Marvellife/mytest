package com.jihe.itheima_16_04;

import java.util.LinkedHashSet;


/**
 * 类功能描述
 *LinkHashSet集合的特点：
 *         1.哈希表和链表实现set接口，具有可预测的迭代次序
 *         2.由链表保证元素有序，也就是说元素的存储和取出的顺序一致
 *         3.由哈希表保证元素的唯一，也就是元素不重复
 *
 * @Author Administrator
 * @Date 2022/1/20 20:41
 */
public class LikedHashSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

        //添加元素
        linkedHashSet.add("hello");
        linkedHashSet.add("world");
        linkedHashSet.add("java");
        System.out.println(linkedHashSet.add("world"));//重复元素返回flase
        //遍历集合
        for (String s : linkedHashSet) {
            System.out.println(s);
        }
    }
}
