package com.io.itheima_22;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/16 18:53
 */
public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis= new FileInputStream("idea_test\\src\\com\\fos.txt");

        /* //读的次数超过了数据的个数，fis.read()救会返回-1
        int a=fis.read();
        System.out.println(a);
        int b=fis.read();
        System.out.println(b);
        int e=fis.read();
        System.out.println(e);
        int f=fis.read();
        System.out.println(f);*/
        int a=-1;
        while ((a=fis.read())!=-1){
            System.out.println((char)a);
            System.out.println(a);
        }

        fis.close();
    }
}
