package com.jihe.itheima_19;


import java.util.ArrayList;
import java.util.Collections;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/29 9:25
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        Student s1 = new Student("lilei", 21);
        Student s2 = new Student("wangqiang", 25);
        Student s3 = new Student("xiaoming", 20);
        Student s4 = new Student("feiying", 22);
        Student s5 = new Student("feiying", 20);
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);
        arrayList.add(s5);
        //sort(List<T> list,Comparator<(? super T)> c)
        //原本
       /* Collections.sort(arrayList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getStuName().compareTo(s2.getStuName()) : num;
                return num2;
            }
        });*/
        //lambda表达式
        Collections.sort(arrayList, (s11, s21) -> {
            int num = s11.getAge() - s21.getAge();
            int num2 = num == 0 ? s11.getStuName().compareTo(s21.getStuName()) : num;
            return num2;
        });
        for (Student s:arrayList
             ) {
            System.out.println(s.getStuName()+","+s.getAge());
        }
    }
}
