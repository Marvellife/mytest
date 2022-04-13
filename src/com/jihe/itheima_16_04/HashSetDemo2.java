package com.jihe.itheima_16_04;

import java.util.HashSet;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/20 23:38
 */
public class HashSetDemo2 {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();
        Student s1=new Student("王强",12);
        Student s2=new Student("李磊",14);
        Student s3 = new Student("孙梅",15);
        Student s4=new Student("李磊",14);
        s2.hashCode();

        //Student类重写hashcode（）和equals。来达到hashset的元素的唯一性
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        hashSet.add(s4);
        System.out.println(hashSet);
    }
}
