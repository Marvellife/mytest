package com.paixu;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/3/16 23:50
 */
public class ShellSort {
    public static void shellSort(int[] arr, int n) throws InterruptedException {
        int gap = n;
        while (gap > 1) {
            gap = gap / 2;
            for (int i = 0; i < n - gap; ++i) {
                int end = i;
                int tem = arr[end + gap];
                while (end >= 0) {
                    if (tem < arr[end]) {
                        arr[end + gap] = arr[end];
                        end -= gap;
                    } else {
                        break;
                    }

                }
                arr[end + gap] = tem;
            }
        }

    }
}
