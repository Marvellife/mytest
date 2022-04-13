package com.jihe.itheima_17;

import java.util.Arrays;

/**
 * 类功能描述
 * 可变参数
 * public static int sum（int...a）{
 * <p>
 * }
 *
 * @Author Administrator
 * @Date 2022/1/21 20:59
 */
public class GenericDemo06 {
    public static void main(String[] args) {
        System.out.println(sum(111, 11, 111, 213, 131));
        System.out.println(sum2(111, 11, 111, 213, 131));
    }

    public static int sum(int... a) {
        System.out.println(Arrays.stream(a).sum());
        return 0;
    }
    //涉及到其他的变量，需要把变量放在可变变量前面，固定的变量负责接收第一个值
    public static int sum2(int b, int... a) {
        return 0;
    }
}
