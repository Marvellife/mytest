package com.duotai.itheima_01;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/10 20:05
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] arr2 = {24, 33, 32,45,132,55,76,84};
        //printArray(arr2);
        System.out.println(maxArray(arr2));
        /*
        左边：
            int：说明数组中的元素是int类型
            []：说明这是一个数组
            arr：是数组的名称
        右边：
            new：申请空间
            int说明数组的元素是int类型
            []说明这是一个数组
            3是数组的长度
        */
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    public static int maxArray(int[] arr){
        int max =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}

