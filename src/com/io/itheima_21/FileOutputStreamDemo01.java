package com.io.itheima_21;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/30 12:26
 */
public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("idea_test\\src\\com\\fos.txt");
        /*
            做了三件事：
                1.调用系统系统功能创建了文件
                2.创建了字节输出流对象
                3.让字节输出流对象指向创建好的文件
        */
        //void write (int b)将指定的字节写入文件输出流
        //write(byte[] b)
        //write(byte[] b.int off, int len)
        fos.write(97);//a
        fos.write(57);//9
        fos.write(55);//7
        fos.close();//关闭流，及其占用的系统资源

    }
}
