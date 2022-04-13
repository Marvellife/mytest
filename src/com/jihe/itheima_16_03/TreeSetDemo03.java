package com.jihe.itheima_16_03;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 类功能描述
 * comparator比较器排序
 *
 * @Author Administrator
 * @Date 2022/1/21 19:39
 */
public class TreeSetDemo03 {
    public static void main(String[] args) {
        //匿名内部类
        TreeSet<Student> treeSet = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //按照年龄升序排序，后面添加的元素是s1，s2就是前面添加的
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getStuName().compareTo(s2.getStuName()) : num;
                return num2;
            }
        });
        Student s1 = new Student("lilei", 21);
        Student s2 = new Student("wangqiang", 25);
        Student s3 = new Student("xiaoming", 20);
        Student s4 = new Student("feiying", 22);

        Student s5 = new Student("liudong", 25);
        Student s6 = new Student("liudong", 25);

        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        treeSet.add(s5);
        treeSet.add(s6);
        for (Student s : treeSet
        ) {
            System.out.println(s.getStuName() + "," + s.getAge());

        }

    }
}
