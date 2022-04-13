package com.jihe.itheima_18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/21 22:50
 */
public class HashMapDemo {
    public static void main(String[] args) {

        Student s1=new Student("lilei",11);
        Student s2=new Student("wangqiang",12);
        Student s3=new Student("sunhong",13);
        Student s4=new Student("zhaomin",14);
        Student s5=new Student("zhaomin",14);

        HashMap<Student,String> hashMap = new HashMap<Student,String >();
        hashMap.put(s1,"李家庄");
        hashMap.put(s2,"王家庄");
        hashMap.put(s3,"孙家庄");
        hashMap.put(s4,"张家庄");
        hashMap.put(s5,"会家庄");
        Set<Map.Entry<Student,String>> set=hashMap.entrySet();
        for (Map.Entry<Student, String> studentStringEntry : set) {
            System.out.println(studentStringEntry.getKey().getStuName()+","+studentStringEntry.getKey().getAge()+","+studentStringEntry.getValue());
        }

        System.out.println(hashMap);
        System.out.println(hashMap.size());
    }
}
