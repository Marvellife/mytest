package com.tools.itheima_11;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/16 21:13
 */
public class ObjectDemo {
    public static void main(String[] args) {

        System.out.println("toString()方法");
        Student s1=new Student();
        s1.setName("林青霞");
        s1.setAge(14);
        //所有类的是Object的子类。都是继承了Object,直接输出对象默认调用了toString()方法，toString()是返回了的是地址
        //没有重写toString()之前显示    com.itheima_11.Student@1b6d3586
        //重写toString之后显示        Student{name='林青霞', age=14}
        System.out.println(s1);
        System.out.println("-----------");

        System.out.println("equals()方法");
        Student s2=new Student();
        s2.setName("林青霞");
        s2.setAge(14);
        System.out.println(s1==s2);//比较的是两个对象的地址，两个对象都是new出来的，地址是不一样的
        System.out.println(s1.equals(s2));
       /* public boolean equals(object obj){
            //equals比较的还是两个对象的地址。
            //this-----s1
            //obj-----s2
            return(this==obj);
        }*/
        //如果需要比较两个对象是否相等就需要重写object的equals方法。

    }
}
