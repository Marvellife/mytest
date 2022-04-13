package com.io.itheima_21;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 类功能描述
 * 字节流写数据时的异常处理
 *
 * @Author Administrator
 * @Date 2022/1/30 12:26
 */
public class FileOutputStreamDemo04 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("idea_test\\src\\com\\fos.txt", true);//append,是否追加
            fos.write("hello".getBytes());
            //换行符号
            //fos.write("\r\n".getBytes());
            System.out.println("写入成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("出现异常");
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("关闭了字节流");
            }
        }
    }
}
