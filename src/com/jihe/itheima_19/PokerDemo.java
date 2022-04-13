package com.jihe.itheima_19;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/29 10:06
 */
public class PokerDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] colors = {"♠", "H", "♢", "♣"};
        String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K","A"};
        arrayList.add("大王");
        arrayList.add("小王");
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < number.length; j++) {
                arrayList.add(colors[i] + number[j]);
            }
        }
        Collections.shuffle(arrayList);
        ArrayList<String> liuyan=new ArrayList<>();
        ArrayList<String> linqingxia=new ArrayList<>();
        ArrayList<String> liuxiao=new ArrayList<>();
        ArrayList<String> liuarray=new ArrayList<>();

        for (int i=0;i<arrayList.size();i++){
            if(i>=arrayList.size()-3){
                liuarray.add(arrayList.get(i));
            }
            else  if(i%3==0){
                liuyan.add(arrayList.get(i));
            }else  if(i%3==1){
                linqingxia.add(arrayList.get(i));
            }else  if(i%3==2){
                liuxiao.add(arrayList.get(i));
            }
        }
        Collections.sort(linqingxia);
        Collections.sort(liuxiao);
        Collections.sort(liuyan);
        System.out.println(linqingxia);
        System.out.println(liuxiao);
        System.out.println(liuyan);



    }
}
