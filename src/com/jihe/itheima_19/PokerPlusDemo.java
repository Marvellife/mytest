package com.jihe.itheima_19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/29 10:35
 */
public class PokerPlusDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        String[] colors = {"♠", "H", "♢", "♣"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int index = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                hashMap.put(index, colors[j] + number[i]);
                arrayList.add(index);
                index++;
            }
        }
        hashMap.put(index, "小王");
        arrayList.add(index);
        index++;
        hashMap.put(index, "大王");
        arrayList.add(index);
        Collections.shuffle(arrayList);
        System.out.println(hashMap);
        TreeSet<Integer> liu = new TreeSet<>();
        TreeSet<Integer> wang = new TreeSet<>();
        TreeSet<Integer> qing = new TreeSet<>();
        ArrayList<Integer> di = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            int x=arrayList.get(i);
            if (i >= arrayList.size() - 3) {
                di.add(x);
            } else if (i % 3 == 0) {
                wang.add(x);
            } else if (i % 3 == 1) {
                qing.add(x);
            } else if (i % 3 == 2) {
                liu.add(x);
            }
        }
        look("林青霞",qing,hashMap);
        look("柳岩",liu,hashMap);
        look("王强",wang,hashMap);
    }
    public static void look(String name,TreeSet<Integer> treeSet,HashMap<Integer,String> hashMap){
        System.out.print(name+"的牌是：");
        for (Integer key:treeSet
             ) {
            System.out.print(hashMap.get(key)+" ");
        }
        System.out.println();
    }
}
