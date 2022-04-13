package com.jihe.itheima_17;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/21 20:45
 */
public class GenericDemo03 {
    public static void main(String[] args) {
        //常规方法
/*        Generic3 generic3=new Generic3();
        generic3.show(12);
        generic3.show("test");
        generic3.show(true);*/
        //泛型类改进
/*        Generic3<Integer> generic1=new Generic3();
        generic1.show(12);
        Generic3<String> generic2=new Generic3();
        generic2.show("test");
        Generic3<Boolean> generic3=new Generic3();
        generic3.show(true);*/
        //泛型方法改进
        // ps：泛型类和泛型方法都可以用
        Generic3 generic1=new Generic3();
        generic1.show(12);
        generic1.show("test");
        generic1.show(true);
    }
}
