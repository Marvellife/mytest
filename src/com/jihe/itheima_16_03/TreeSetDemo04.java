package com.jihe.itheima_16_03;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * 类功能描述
 * 产生10个随机数，要求在1-20之间，且不能重复。
 *
 * @Author Administrator
 * @Date 2022/1/21 20:01
 */
public class TreeSetDemo04 {
    public static void main(String[] args) {
        //HashSet不排序
        //Set<Integer> treeSet = new HashSet<Integer>();
        //TreeSet自然排序
        Set<Integer> treeSet = new TreeSet<Integer>();
        while (treeSet.size() < 10) {
            Random random = new Random();
            Integer i = random.nextInt(20)+1;
                treeSet.add(i);
        }
        System.out.println("-----------------------");
        for (Integer integer : treeSet
        ) {
            System.out.println(integer);

        }
    }
}
