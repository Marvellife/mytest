package com.duotai.itheima_02;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/11 22:05
 */
public class Student {
    private String studentName;
    private int studentAge;

    public Student() {
    }

    public Student(String studentName, int studentAge) {
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public String getStudentName() {
        return this.studentName;
    }

    public void setAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getStudentAge() {
        return this.studentAge;
    }

    public void show() {
        System.out.println("姓名：" + this.getStudentName() + "年龄：" + this.getStudentAge());
    }
}
