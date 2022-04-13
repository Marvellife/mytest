package com.duotai.itheima_04;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/14 21:42
 */
public class Demo {
    public static void main (String[] args){
        Teacher t1= new Teacher();
        t1.setName("林青霞");
        t1.setAge(45);
        System.out.println("老师姓名："+t1.getName()+"   老师的年龄："+t1.getAge());
        t1.teach();
        System.out.println("----------------------------------------");
        Teacher t2=new Teacher("张曼玉",54);
        System.out.println("老师姓名："+t2.getName()+"   老师的年龄："+t2.getAge());
        t2.teach();


     /*   Student s1= new Student();
        s1.setName("李磊");
        s1.setAge(17);
        System.out.println("学生姓名："+s1.getName()+"   学生的年龄："+s1.getAge());
        s1.study();*/
    }
}
