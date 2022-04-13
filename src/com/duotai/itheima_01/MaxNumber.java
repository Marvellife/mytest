package com.duotai.itheima_01;

import java.util.Scanner;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/10 23:51
 */
public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();
        System.out.println("最大值为：" + maxNumber(a,b));
    }

    public static int maxNumber(int a, int b) {
        if (a > b) {
            return a;
        } else
            return b;
    }

}
