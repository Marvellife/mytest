package com.io.itheima_20;

import java.io.File;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/29 12:25
 */
public class FileDemo03 {
    public static void main(String[] args) {
        File f3=new File("idea_test\\src\\com\\io\\itheima_20\\java.txt");
        System.out.println(f3.delete());//删除文件
        File f4=new File("idea_test\\itcast");
        System.out.println(f4.mkdir());
        //删除文件夹时，如果下级有文件，就不能删除！要先删除文件，在来删除文件夹。
        System.out.println(f4.delete());//删除文件夹

    }
}
