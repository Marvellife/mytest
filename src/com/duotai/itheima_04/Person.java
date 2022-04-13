package com.duotai.itheima_04;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/14 21:41
 */
public class Person {
    private String name;
    private int age;
/*    public static void test(){
        System.out.println("人类的静态方法");
    }*/
    public Person() {
        System.out.println("人类的无参构造器");
    }

    public Person(String name, int age) {
        System.out.println("人类的有参构造器");
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


}
