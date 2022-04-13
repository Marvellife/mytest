package com.io.itheima_20;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/30 9:38
 */
public class DiGuiDemo02 {
    public static void main(String[] args) {
        System.out.println(f(29));
    }
    public static int f(int n){
        if(n==1){
            return 1;
        }
        else
            return n*f(n-1);
    }
}
