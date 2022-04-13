package com.jihe.itheima_17;

/**
 * 类功能描述
 *  泛型接口测试
 * @Author Administrator
 * @Date 2022/1/21 20:59
 */
public class GenericDemo04 {
    public static void main(String[] args) {
        Generic4<String> g1 = new GenericImpl4<String>();
        g1.show("林青霞");
        Generic4<Integer> g2=new GenericImpl4<Integer>();
        g2.show(22);
    }
}
