package com.jihe.itheima_16_03;

import java.util.TreeSet;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/21 19:08
 */
public class TreeSetDemo02 {
    public static void main(String[] args) {
        TreeSet<Student>    treeSet= new TreeSet<Student>();

        Student s1 = new Student("lilei", 21);
        Student s2 = new Student("wangqiang", 25);
        Student s3 = new Student("xiaoming", 20);
        Student s4 = new Student("feiying", 22);
        Student s5=new Student("liudong",25);
        Student s6=new Student("liudong",25);

        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        treeSet.add(s5);
        treeSet.add(s6);
        for (Student s:treeSet
             ) {
            System.out.println(s.getStuName()+","+s.getAge());

        }

    }

}
