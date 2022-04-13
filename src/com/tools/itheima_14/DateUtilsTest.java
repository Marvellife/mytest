package com.tools.itheima_14;

import java.text.ParseException;
import java.util.Scanner;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/17 17:48
 */
public class DateUtilsTest {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要的转换类型（序号）：1.日期转字符串；2.字符串转日期");
        int i = scanner.nextInt();
        while (true) {
            if (i == 1) {
                System.out.println("您选择了日期转字符串");
                System.out.println("转换如下");
                java.util.Date date=new java.util.Date();
                System.out.println(DateUtils.dateToString(date));
                break;
            } else if (i == 2) {
                System.out.println("字符串转日期");
                System.out.println("转换如下");
                String s=new String();
                s="2032-01-17 17:22:19";
                System.out.println(DateUtils.stringToDate(s));
                break;
            } else {
                System.out.println("您输入的序号有误!请重新输入：");
                i=scanner.nextInt();
            }
        }
    }
}
