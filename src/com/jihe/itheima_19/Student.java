package com.jihe.itheima_19;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/29 9:26
 */
public class Student {
    private String stuName;
    public int age;

    public Student() {
    }

    public Student(String stuName, int age) {
        this.stuName = stuName;
        this.age = age;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
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
                "stuName='" + stuName + '\'' +
                ", age=" + age +
                '}';
    }
}
