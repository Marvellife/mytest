package com.jihe.itheima_16_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 类功能描述
 *  测试并发修改异常
 * @Author Administrator
 * @Date 2022/1/19 0:07
 */
public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");
        Iterator<String > iterator=list.listIterator();
        while (iterator.hasNext()){
            String s=iterator.next();
            System.out.println(s);
            if(s.equals("world")){
                list.add("fffffffff");
                //并发修改异常，迭代器遍历过程中，通过集合对象修改了集合中分元素长度
                //造成了迭代器获取元素中的判断预期修改值和实际修改值不一致
            }
        }
       /* for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
            System.out.println(list.size());
            if(list.get(i).equals("world")){
                list.add("dddddddddd");//不会出现异常，因为for循环遍历的时候，没有检查
            }
        }*/
    }
}
