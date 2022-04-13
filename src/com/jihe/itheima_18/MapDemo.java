package com.jihe.itheima_18;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/21 22:02
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");
//        System.out.println(map.remove("杨过"));//返回小龙女
//        System.out.println(map.remove("李大钊"));//返回null
//        map.clear();//清空
//        System.out.println(map.containsKey("杨过"));//返回true
        System.out.println(map.containsKey("李大钊"));//返回flase
        System.out.println(map.containsValue("小龙女"));//返回true
        System.out.println(map.isEmpty());//返回flase
        System.out.println(map.size());//返回3
        System.out.println(map.get("杨过"));//返回小龙女
        System.out.println(map.get("李大钊"));//返回null
        System.out.println(map.keySet());//返回所有键的集合，是一个set集合。
        System.out.println(map.values());//返回所有值得集合，是一个set集合。可以用增强for遍历


        System.out.println(map);

        // map集合的遍历
        Set<String> set = new HashSet<String>();
        set = map.keySet();
        for (String s : set
        ) {
            System.out.print(s);
            System.out.print("-");
            System.out.println(map.get(s));

        }

        //map集合遍历
       Set<Map.Entry<String,String>>set1 = map.entrySet();
        for (Map.Entry<String, String> stringStringEntry : set1) {
            //System.out.println(stringStringEntry);
            String key=stringStringEntry.getKey();
            String value =stringStringEntry.getValue();
            System.out.println(key+","+value);
        }


    }
}
