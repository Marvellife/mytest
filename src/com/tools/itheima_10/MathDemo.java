package com.tools.itheima_10;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/16 20:32
 */
public class MathDemo {
    public static void main(String[] args) {
        //public static int abs(int a)                    返回参数的绝对值
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));
        System.out.println("---------");
        //public static double ceil(double a)             返回大于或等于参数的最小的double值，等于一个整数
        System.out.println(Math.ceil(12.33));
        System.out.println(Math.ceil(12.77));
        System.out.println(Math.ceil(-12.33));
        System.out.println(Math.ceil(-12.77));
        System.out.println("---------");
        //public static double floor(double a)            返回小于活等于参数的最大的double值，等于一个整数

        System.out.println(Math.floor(12.33));
        System.out.println(Math.floor(12.77));
        System.out.println(Math.floor(-12.33));
        System.out.println(Math.floor(-12.77));
        System.out.println("---------");
        //public static int round(float a)                按照四舍五入返回最接近参数的int
        System.out.println(Math.round(12.33F));
        System.out.println(Math.round(12.77F));
        System.out.println(Math.round(-12.33F));
        System.out.println(Math.round(-12.77F));
        System.out.println("---------");
        //public static int max(int a ,int b)             返回两个int值中较大的值
        System.out.println(Math.max(452,321));
        System.out.println("---------");
        //public static int min(int a,int b)              返回两个int值中较小的值
        System.out.println("---------");
        //public static double pow(double a,double b)     返回a的b次幂的值
        System.out.println(Math.pow(2.00,26.00));
        System.out.println("---------");
        //public static double random()                   返回值为double的正值（0.0，1.0）
        System.out.println(Math.random());
        System.out.println((int)((Math.random()*100)));

    }
}
