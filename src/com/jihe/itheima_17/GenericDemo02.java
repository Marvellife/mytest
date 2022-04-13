package com.jihe.itheima_17;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/21 20:35
 */
public class GenericDemo02 {
    public static void main(String[] args) {
        //使用了泛型，在使用时才定义他的类型
        Generic2<String> generic =  new Generic2<String>();
        generic.setT("string");
        Generic2<Integer> generic2 =  new Generic2<Integer>();
        generic2.setT(11);
        Generic2<Boolean> generic3 =  new Generic2<Boolean>();
        generic3.setT(true);

    }
}
