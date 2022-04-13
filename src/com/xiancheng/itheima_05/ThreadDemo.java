package com.xiancheng.itheima_05;

import java.util.*;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/19 19:29
 */
public class ThreadDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer(); //线程安全
        StringBuilder stringBuilder=new StringBuilder();//线程不安全
        Vector<String> vector= new Vector<>();          //线程安全
        ArrayList<String > arrayList= new ArrayList<>();//线程不安全
        Hashtable<Integer,String> hashtable= new Hashtable<>();//线程安全
        HashMap<Integer,String> hashMap = new HashMap<>();//线程不安全
        List<String> list = Collections.synchronizedList(new ArrayList<String>());

    }
}
