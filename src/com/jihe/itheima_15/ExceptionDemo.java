package com.jihe.itheima_15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/17 19:14
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        //method();     //调用运行时异常的方法
        try {
            method2();      //调用编译时异常的方法
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    //编译时异常
    public static void method2() throws ParseException {
            String s = "2022-12-12";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = simpleDateFormat.parse(s);
            System.out.println(date);

    }

    //运行时异常
    public static void method() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);//出现运行时异常：ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }
}
