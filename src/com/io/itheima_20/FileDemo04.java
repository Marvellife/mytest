package com.io.itheima_20;

import java.io.File;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/29 12:25
 */
public class FileDemo04 {
    public static void main(String[] args) {
        File file = new File("idea_test\\src\\com\\io\\itheima_20\\java.txt");
        System.out.println(file.isDirectory());//测试此抽象路径名表示的是否为目录
        System.out.println(file.isFile());//是否为文件
        System.out.println(file.exists());//是否存在
        System.out.println("-----------------");
        System.out.println(file.getAbsoluteFile());//返回此抽象路径名的绝对路径名字的字符串
        System.out.println(file.getPath());//返回此抽象路径名转换为路径名字符串
        System.out.println(file.getName());//返回此对象路径名表示的文件或目录的名称
        System.out.println("-----------------");
        File file1 =new File("D:\\itcast");
        String[] strArray= file1.list(); //返回该目录下的所有目录或文件的名字数组
        for (String s:strArray
             ) {
            System.out.println(s);
        }
        System.out.println("-----------------");
        File[] fileArray = file1.listFiles();//返回该目录下的目录或文件的完整路径名的数组
        for (File f:fileArray
             ) {
            //System.out.println(f);//完整路径
            // System.out.println(f.getName());//只拿名字

            if(f.isFile()){
                System.out.println(f.getName());//只拿文件的名字，没有目录名字
            }
        }

    }
}
