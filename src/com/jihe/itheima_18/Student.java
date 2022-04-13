package com.jihe.itheima_18;

import java.util.Objects;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/21 22:29
 */
public class Student {
    private String stuName;
    private int age;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(stuName, student.stuName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuName, age);
    }
}