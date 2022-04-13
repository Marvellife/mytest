package com.duotai.itheima_03;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/12 20:08
 */
public class Student2 {
    /**
     *
     */
    private String studentName;
    private int studentAge;

    public Student2() {
    }

    public Student2(String studentName, int studentAge) {
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public void show(){
        System.out.println("姓名："+studentName+" 年龄："+studentAge);
    }

}
