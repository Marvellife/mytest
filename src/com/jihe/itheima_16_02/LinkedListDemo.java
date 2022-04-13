package com.jihe.itheima_16_02;

import java.util.LinkedList;

/**
 * 类功能描述
 * LinkedList特有方法
        *  public void addFirst（）		在头添加元素
        * 	public void addLast（）		在末尾添加元素
        * 	public E getFirst（）		返回第一个元素
        * 	public E getList（）		返回最后一个元素
        * 	public E removeFirst（）		从链表中删除并返回第一个元素
        * 	public E removeLast（）		从链表中删除并返回最后一个元素
 * @Author Administrator
 * @Date 2022/1/20 22:15
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        //public void addFirst()		//在头添加元素
        linkedList.addFirst("addFirst");
        //public void addLast()		//在末尾添加元素
        linkedList.addLast("addLast");
        //public E getFirst()		    //返回第一个元素
        //public E getList()		    //返回最后一个元素
        //public E removeFirst()      //从链表中删除并返回第一个元素
        //public E removeLast()       //从链表中删除并返回最后一个元素
    }
}
