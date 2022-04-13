package com.jihe.itheima_16_01;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/18 23:08
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection<Student> collection = new ArrayList<>();
        Student s1 = new Student("lilei", 13);
        Student s2 = new Student("wangqiang", 15);
        Student s3 = new Student("sunqiang", 16);
        collection.add(s1);
        collection.add(s2);
        collection.add(s3);
        Iterator<Student> iterator = collection.iterator();
        while (iterator.hasNext()) {
            //System.out.println(iterator.next());
            Student student = iterator.next();
            System.out.println(student.getStudentName()+student.getAge());
        }
    }

}
