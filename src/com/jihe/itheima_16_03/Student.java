package com.jihe.itheima_16_03;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/21 19:06
 */
public class Student implements Comparable<Student>{
    private String stuName;
    private int age;

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
    public int compareTo(Student s) {
        //return 0; 认为是想等的不存储
        //return 1; 认为后者更大排后面
        //return -1;认为前者更大，所以排前面
        int num= this.age-s.age;//按照年龄升序排序，后面添加的元素是this，s就是前者
        //int num= s.age-this.age;//按照年龄降序
        /* if(num==0){
            num=this.stuName.compareTo(s.stuName);
        }
        return num;*/

        //完整算法
        int num2=num==0?this.stuName.compareTo(s.stuName):num;
        return num2;
    }

}
