package com.jihe.itheima_15;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/20 20:07
 */
public class ExceptionDemo2 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //System.out.println("您访问的索引不存在！");

            //throwable的3个成员方法
            //e.printStackTrace();
            //System.out.println(e.getMessage());//jdk8输出3，jdk11输出index 3 out bounds for length 3
            //System.out.println(e.toString());
        }
    }

    /**
     * 类功能描述
     *
     * @Author Administrator
     * @Date 2022/1/20 20:27
     */
    public static class ExceptionDemo3 {
        public static void main(String[] args) {
            method();
        }


        public static void method() {
            try {
                int[] arr = {1, 2, 3};
                System.out.println(arr[3]);//运行时异常，又称为未受检异常
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
    }
}
