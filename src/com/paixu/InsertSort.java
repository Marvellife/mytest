package com.paixu;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/3/16 23:48
 */
public class InsertSort {
    public static void insertSort(int[] arr, int n) throws InterruptedException {
        for (int i = 0; i < n - 1; i++) {
            System.out.println("---------第" + (i + 1) + "轮--------");
            int end = i;
            int tem = arr[end + 1];
            while (end >= 0) {
                if (tem < arr[end]) {
                    arr[end + 1] = arr[end];
                    end--;
                } else {
                    break;
                }
            }
            arr[end + 1] = tem;
            if (true) {
                for (int i1 : arr) {
                    System.out.print(arr[i1 - 1] + ":");
                    int j;
                    for (j = 0; j < arr[i1 - 1]; j++) {
                        System.out.print("口");
                    }
                    System.out.println("");
                    j -= arr[i1 - 1];
                }
                Thread.sleep(3000);
            }
            System.out.println("");
        }
    }
}

