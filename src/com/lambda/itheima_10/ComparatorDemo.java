package com.lambda.itheima_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 类功能描述
 *  如果方法的返回值是一个函数式接口，可以用lambda表达式作为返回。
 * @Author Administrator
 * @Date 2022/2/22 20:08
 */
public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("cccc");
        arrayList.add("aa");
        arrayList.add("b");
        arrayList.add("ddd");
        System.out.println(arrayList);
        Collections.sort(arrayList);
//        System.out.println(arrayList);
        Collections.sort(arrayList,getComparator());
        System.out.println(arrayList);
    }
    private  static Comparator<String> getComparator() {
        /*Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length()-s2.length();
            }
        };
        return comparator;}*/

       /*return new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };*/

        return (s1,s2)->s1.length()-s2.length();
    }
}
