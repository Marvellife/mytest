package com.duotai.itheima_02;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/11 22:12
 */
public class test
{
    public static void main(String[] args) {
        Student student=new Student("lilei",11);
        System.out.println(student.getStudentName()+student.getStudentAge());
        student.show();
        Student student1 = new Student();
        student1.setStudentName("王强");
        student1.setAge(13);
        System.out.println(student1.getStudentName()+student1.getStudentAge());
        student1.show();


    }
}
