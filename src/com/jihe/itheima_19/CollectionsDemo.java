package com.jihe.itheima_19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/29 9:12
 */
public class CollectionsDemo {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(10);
        list.add(40);
        //自然排序
        //Collections.sort(list);
        //反转
        //Collections.reverse(list);
        //随机排序
        Collections.shuffle(list);
        System.out.println(list);
    }
}
