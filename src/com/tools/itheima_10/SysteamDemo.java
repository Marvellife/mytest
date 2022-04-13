package com.tools.itheima_10;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/16 21:08
 */
public class SysteamDemo {
    public static void main(String[] args) {
        long start =System.currentTimeMillis();
        for(int i = 0;i<10000;i++){
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start+"毫秒");
    }
}
