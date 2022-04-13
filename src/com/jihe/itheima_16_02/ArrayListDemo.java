package com.jihe.itheima_16_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/20 21:57
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");
        //三种遍历方式
        System.out.println("增强for");
        for (String s:arrayList){
            System.out.println(s);
        }

        System.out.println("迭代器Iterator");
        Iterator<String> iterator=arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("普通for");
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        System.out.println("---------------------");

        LinkedList<String> linkedList=new LinkedList<String>();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");
        //同样三种遍历

    }
}
