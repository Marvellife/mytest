package com.tools.itheima_12;


import java.util.Arrays;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/16 22:33
 */
public class ArraysDemo {
    public static void main(String[] args) {

        //冒泡排序
        /*int[] arr = {53, 32, 95, 66, 42, 54, 102, 84, 77, 89};
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }

            }
            System.out.println("第" + (j + 1) + "次排序之后：");
            System.out.print("[");
            for (int k = 0; k < arr.length; k++) {
                if (k == arr.length - 1) {
                    System.out.print(arr[k]);
                } else {
                    System.out.print(arr[k] + ",");
                }
            }
            System.out.println("]");
        }*/


        //Arrays之toString()和sort()排序
        int[] arr = {53, 32, 95, 66, 42, 54, 102, 84, 77, 89};
        System.out.println("排序前："+Arrays.toString(arr));
        long start=System.currentTimeMillis();
        Arrays.sort(arr);
        long end=System.currentTimeMillis();
        System.out.println("排序后："+Arrays.toString(arr));
        System.out.println(end-start);


    }
}
