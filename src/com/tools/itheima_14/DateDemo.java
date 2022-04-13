package com.tools.itheima_14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/17 16:57
 */
public class DateDemo {
    public static void main(String[] args) throws ParseException {
        //当前时间
        Date date=new Date();
        System.out.println(date);
        //从1970年到现在的毫秒值
        long time=date.getTime();
        System.out.println(time);

        //
        // 设置时间
        long time2=1000*60*60;
        //设置时间两种都可以，一个是通过构造方法，一个是通过成员方法
        // Date data2= new Date(time2);
        Date data2=new Date();
        data2.setTime(time2);
        System.out.println(data2);

        //日期格式化
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1=new Date();
        String s=simpleDateFormat.format(date1);
        System.out.println(s);


        //日期解析
        String ss="2022-01-17 17:20:05";
        System.out.println(simpleDateFormat.parse(ss));;
    }
}
