package com.tools.itheima_11;

import java.util.Objects;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/16 21:13
 */
public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



    //直接敲equals就会自动重写object的equals（）方法。
    @Override
    public boolean equals(Object o) {
        /*
        * this------s1 也就是调用者
        * o---------s2  传过来的对象
        * */
        //先判断两个的地址是否相同，如果相同直接返回true
        if (this == o) return true;
        //判断参数是否为null
        //判断两个对象是否来自同一个类
        if (o == null || getClass() != o.getClass()) return false;
        //由object类型向下转型
        Student student = (Student) o;   //student=s2
        //判断年龄和姓名是否相同，
        return age == student.age && Objects.equals(name, student.name);
        //此处好像jdk11有别的写法。,如下
       /* if(age!=student.age)
            return false;
        //三目运算运算理解，a？b：c
        //如果a是true那么就返回b的结果，否则就c
        return  name!=null?name.equals(student.name) :student.name==null;*/
    }
}
