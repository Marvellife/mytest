package com.jihe.itheima_16_03;

import java.util.TreeSet;

/**
 * 类功能描述
 *      TreeSet集合特点：
 * 	        元素有序，不是存储和取出元素有序，而是按照一定的规则排序，
 * 	        具体排序方法取决于构造方法。
 * 	        TreeSet（）：根据其元素的自然排序进行排序。
 * 	        TreeSet(Comparator comparator)：根据指定的比较器进行排序
 * @Author Administrator
 * @Date 2022/1/21 18:59
 */
public class TreeSetDemo01 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(10);
        treeSet.add(40);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(50);
        treeSet.add(30);

        for (Integer integer : treeSet) {
            System.out.println(integer);
        }
    }
}
