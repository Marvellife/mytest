package com.io.itheima_21;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/30 12:26
 */
public class FileOutputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("idea_test\\src\\com\\fos.txt");
        //其他两种写法
        //File file =new File("idea_test\\src\\com\\fos.txt");
        //FileOutputStream fos =new FileOutputStream(file);
        //FileOutputStream fos = new FileOutputStream(new File("idea_test\\src\\com\\fos.txt"));
        /*fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.write(100);
        fos.write(101);*/
        /*byte[] bytes={97,98,99,100,101,102};
        fos.write(bytes);*/
        byte[] byte1="abcde".getBytes();
        fos.write(byte1);
        byte[] byte2="abcde".getBytes();
        fos.write(byte2,1,3);//从索引1开始写3个，索引1是b

        fos.close();
    }
}
