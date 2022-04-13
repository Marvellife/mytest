package com.paixu;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/3/16 23:55
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr, int n) {
        int end = n;
        while (end > 0) {
            for (int i = 1; i < n; ++i) {
                if (arr[i - 1] > arr[i]) {
                    int tem = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = tem;

                }
            }
            for (int j : arr) {
                System.out.print(arr[j- 1]);
            }
            System.out.println("");
            --end;
        }
    }
}

