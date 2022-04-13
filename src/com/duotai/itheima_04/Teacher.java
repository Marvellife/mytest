package com.duotai.itheima_04;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/14 21:42
 */
public class Teacher extends Person {
    public Teacher(String name,int age){
        super(name,age);
        System.out.println("老师的有参构造器");
    }

    public Teacher() {
        System.out.println("老师的无参构造器");
    }


    public void teach(){
        System.out.println("用爱成就每一位学员"+super.getName()+"，"+super.getAge());
    }
}
