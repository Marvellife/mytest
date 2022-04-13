package com.jihe.itheima_17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 类功能描述
 *  collection集合存储字符串并遍历
 *
 *  //使用泛型之后吧运行时异常变为编译时异常
 * @Author Administrator
 * @Date 2022/1/21 20:21
 */
public class GenericDemo {
    public static void main(String[] args) {
        //Collection c=new ArrayList();
        Collection<String> c=new ArrayList<String>();

        c.add("hello");
        c.add("world");
        c.add("java");
        //c.add(100);//会报错interger不能转成String
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()){
           /* Object o=iterator.next();//默认为object类型
            System.out.println(o);*/
            String s =iterator.next();
            System.out.println(s);
        }
    }
}
