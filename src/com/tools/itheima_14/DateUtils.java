package com.tools.itheima_14;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/17 17:24
 */
public class DateUtils {
    private DateUtils(){

    }

    public static String dateToString(java.util.Date d) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return simpleDateFormat.format(d);
    }

    public static java.util.Date stringToDate(String s) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return simpleDateFormat.parse(s);
    }

}
