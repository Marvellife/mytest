package com.duotai.itheima_06;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/15 22:25
 */
public abstract class Animal {
    private int age=20;
    private final String city="北京";
    public Animal(){

    }
    public void show(){
        age=30;
        System.out.println(city);
        System.out.println(age);
    }
    public abstract void eat();
}
