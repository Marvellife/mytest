package com.io.itheima_20;

import java.io.File;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/29 11:25
 */
public class FileDemo01 {
    public static void main(String[] args) {
        //File（String pathname），通过给指定的路径名字符串转换为抽象的路径名来创建新的File实例。
        File f1 = new File("E:\\itcast\\java.txt");
        System.out.println(f1);

        //File（String parent，String child）从父路径名字字符串和子路径字符串来创建新的File实例
        File f2 =new File("E:\\itcast","java.txt");
        System.out.println(f2);

        //File（File parent，String child）从父抽象路径和子路径名字符串创建新的File实例
        File f3 = new File("E:\\itcast");
        File f4 =new File(f3,"java.txt");
        System.out.println(f4);
    }
}
