package com.Test;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/19 23:24
 */
public class test01 {
    public static void main(String[] args) {
//        int score = 40;
//        System.out.println(test01.gread(score));
//        tel();
        test02();
    }

    public static char gread(int score) {
        int a = 0;
        int b = 2;
        if (a > b) {
            int max = a;
        } else {
            int max = b;
        }
        int max = a > b ? a : b;
        System.out.println(max);

        return score >= 90 ? 'a' : score < 90 && score >= 60 ? 'b' : 'c';
    }
    public static void  tel(){
        int[] arr = new int[]{8,2,1,0,3};
        int[] index = new int []{2,0,3,2,4,0,1,3,2,3,3};
        String tel="";
        for (int i : index) {
            tel+=arr[i];
        }
        System.out.println("联系方式:"+tel);
    }
    public static void test02(){
        int i=0;
       i= i++;
        int j=i++;
        System.out.println(i);
        System.out.println(j);
    }

}
