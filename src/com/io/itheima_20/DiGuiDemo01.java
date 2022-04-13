package com.io.itheima_20;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/30 9:19
 */
public class DiGuiDemo01 {
    public static void main(String[] args) {
        //不死神兔，开始两个兔子，求20个月兔子的对数。
        //每个月的兔子对数，1，1，2，3，5，8，13.......
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[19]);
        System.out.println(f(20));
    }

    /*
        地柜解决问题，首先就是要定义一个方法
        定义一个方法f(n),表示第n个月的兔子对数
        那么第n-1个月的兔子对数就是f(n-1)
        同理，第n-2个月就是f(n-1)
    */
    public static int f(int n) {
        int m=0;
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return m=f(n - 1) + f(n - 2);// java.lang.StackOverflowError,递归太深，缺少出口
        }
    }
}
