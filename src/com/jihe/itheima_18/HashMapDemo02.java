package com.jihe.itheima_18;

import java.util.*;

/**
 * 类功能描述
 *创建一个ArrayList集合，存储三个元素，每个元素都是一个HashMap，每个HashMap的键和值都是String
 * 并遍历。
 * @Author Administrator
 * @Date 2022/1/21 23:50
 */
public class HashMapDemo02 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap1 = new HashMap<>();
        hashMap1.put("1","11");
        hashMap1.put("2","22");
        HashMap<String,String> hashMap2 = new HashMap<>();
        hashMap2.put("3","33");
        hashMap2.put("4","44");
        HashMap<String,String> hashMap3 = new HashMap<>();
        hashMap3.put("5","55");
        hashMap3.put("6","66");
        ArrayList<HashMap<String,String>> list=new ArrayList<>();
        list.add(hashMap1);
        list.add(hashMap2);
        list.add(hashMap3);
        for (HashMap hashMap : list) {
            Set<Map.Entry<String,String>> set=hashMap.entrySet();
            for (Map.Entry<String, String> stringStringEntry : set) {
                System.out.println(stringStringEntry.getKey()+","+stringStringEntry.getValue());
            }
            System.out.println("--------------------------------");

        }

    }
}
