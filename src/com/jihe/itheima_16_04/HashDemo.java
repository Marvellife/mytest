package com.jihe.itheima_16_04;


/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/20 22:38
 */
public class HashDemo {
    public static void main(String[] args) {
        Student student =new Student("lilei",33);

        //同一个对象多次调用hashCode()方法返回的哈希值是相同的
        System.out.println(student.hashCode());//460141958
        System.out.println(student.hashCode());//460141958
        System.out.println(student.hashCode());//460141958

        //默认情况下，不同对象的哈希值是不相同的
        //通过方法的重写，可以实现不同对象的哈希值是相同的
        Student student2 =new Student("lilei",33);
        System.out.println(student2.hashCode());//1163157884
        System.out.println("---------------");

        System.out.println("hello".hashCode());//99162322
        System.out.println("world".hashCode());//113318802
        System.out.println("java".hashCode());//3254818

        System.out.println("world".hashCode());//113318802
        System.out.println("----------------");

        //这两个字符串的哈希值相同
        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395

    }
}
