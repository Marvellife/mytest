package com.jihe.itheima_16_02;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * 类功能描述
 *列表迭代器
 * @Author Administrator
 * @Date 2022/1/19 0:23
 */
public class ListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");

        //正向遍历
        ListIterator<String> iterator=list.listIterator();
        /*while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }*/

       /* System.out.println("-------------");
        //逆向遍历
        while (iterator.hasPrevious()){
            String s=iterator.next();
            System.out.println(s);
        }*/
        System.out.println("-------------");
        //通过列表迭代器添加，与ListDemo2中的Itertor迭代器不同，列表迭代器有添加功能
        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
            if(s.equals("world")){
                iterator.add("javaee");//添加在world后面了
            }
        }
        System.out.println(list);
    }
}
