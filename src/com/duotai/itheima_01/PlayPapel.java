package com.duotai.itheima_01;

import java.util.Random;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/11 17:38
 */
public class PlayPapel {
    public static void main(String[] args) {
        String[] arr = {"黑", "红", "方", "梅"};
        String[] arr1 = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] arr2 = new String[54];
        arr2[52] = "大王";
        arr2[53] = "小王";
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr2[k] = arr[i] + arr1[j];
                k++;
            }
        }
       /* for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");

        }*/
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < arr2.length; j++) {
                Random random = new Random();
                int a = random.nextInt(arr2.length);
                String temp = arr2[a];
                arr2[a] = arr2[j];
                arr2[j] = temp;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");

        }
        String[] play1 = new String[20];
        String[] play2 = new String[20];
        String[] play3 = new String[20];
        String[] play4 = new String[20];
        int j = 0;
        for (int i = 1; i < arr2.length; i++) {
            if (i % 3 ==0) {
                play3[j] = arr2[i];
            }
            if (i % 2 == 0) {
                play2[j] = arr2[i];
            }
            if (i % 1 == 0) {
                play1[j] = arr2[i];
                j++;
            }
        }

        System.out.println("玩家1的牌");
        for (int i = 0; i < play1.length; i++) {
            System.out.print(play1[i] + " ");

        }
        System.out.println("玩家2的牌");
        for (int i = 0; i < play2.length; i++) {
            System.out.print(play2[i] + " ");

        }
        System.out.println("玩家3的牌");
        for (int i = 0; i < play3.length; i++) {
            System.out.print(play3[i] + " ");

        }
        System.out.println("玩家4的牌");
        for (int i = 0; i < play4.length; i++) {
            System.out.print(play4[i] + " ");

        }
    }
}