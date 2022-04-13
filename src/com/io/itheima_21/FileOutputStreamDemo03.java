package com.io.itheima_21;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Time;

/**
 * 类功能描述
 *      字节流换行
 *      windows \r\n
 *      moc     \r
 *      linux   \n
 *      idea   以上任意
 *      字节流追加写入
 *      FileOutputStream fos = new FileOutputStream(name,true);//写了true就是追加写入
 *      FileOutputStream fos = new FileOutputStream("idea_test\\src\\com\\fos.txt",true);
 *
 *
 * @Author Administrator
 * @Date 2022/1/30 12:26
 */
public class FileOutputStreamDemo03 {
    static int m=0;
    public static void main(String[] args) throws IOException {
        System.out.println(test());
        System.out.println(m);

    }
    public static int test() throws IOException {
        //创建字节输出流对象

        //FileOutputStream fos = new FileOutputStream("idea_test\\src\\com\\fos.txt");
        FileOutputStream fos = new FileOutputStream("idea_test\\src\\com\\fos.txt",true);
        try{
            for (int i=0;i<10;i++){
                fos.write("hello".getBytes());
                fos.write("\r\n".getBytes());
            }
            System.out.println("写入成功");
            return m++;
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("出现异常");
            return m=m+10;
        }
        finally {
            fos.close();
            System.out.println("关闭了字节流");
            System.out.println(m);
            return --m;
        }
    }
}
