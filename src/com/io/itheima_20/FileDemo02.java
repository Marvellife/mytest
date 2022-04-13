package com.io.itheima_20;

import java.io.File;
import java.io.IOException;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/29 11:52
 */
public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        //需求1：在d:\\itcast目录创建一个文件java.txt,
        // createNewFile()创建文件的时候，他的上级目录不存在时就会创建失败
        // 要先创建上级文件夹，在再文件。
        File f1 = new File("d:\\itcast\\java.txt");
        System.out.println(f1.createNewFile());
        System.out.println("--------------");

        //需求2.在d:\\itcast目录创建一个javase目录
        File f2 = new File("d:\\itcast\\javase");
        System.out.println(f2.mkdir());
        System.out.println("--------------");

        //需求3.在d:\\itcast目录下创建一个多级目录javaweb\\html
        File f3 = new File("d:\\itcast\\javaweb\\html");
        //System.out.println(f3.mkdir());//不行
        System.out.println(f3.mkdirs());
        System.out.println("--------------");

        //需求4.在d:\\itcast目录创建一个文件javase.txt
        File f4 = new File("d:\\itcast\\javase.txt");
        System.out.println(f4.createNewFile());
    }
}
