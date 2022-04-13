package com.jihe.itheima_18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * 类功能描述
 * 需求：创建一个HashMap集合，存储三个键值对元素，每个键值对元素的键是String，值是Arraylist：
 *
 * @Author Administrator
 * @Date 2022/1/22 0:11
 */
public class HashMapDemo03 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("诸葛亮");
        arrayList1.add("刘备");
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("唐僧");
        arrayList2.add("孙悟空");
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("武松");
        arrayList3.add("西门庆");
        hashMap.put("三国演义",arrayList1);
        hashMap.put("西游记",arrayList2);
        hashMap.put("水浒传",arrayList3);
        Set<String> set = hashMap.keySet();
        for (String s : set) {
            ArrayList<String> arrayList=hashMap.get(s);
            System.out.println(s);
            for (String s1 : arrayList) {
                System.out.println(s1);
            }
            System.out.println("-------------------------");
        }


    }
}
