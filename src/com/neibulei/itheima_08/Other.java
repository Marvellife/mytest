package com.neibulei.itheima_08;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/16 18:58
 */
public class Other {
    private int num = 10;
    public void show2(){
        System.out.println("Other.show2");
    }
    public void method() {
        int num1=12;
        System.out.println();
        class Inner {
            public void show() {
                //  局部内部类使用了局部变量,这个变量被会定义为final类型,不能修改.
                // num1=num1+2;
                System.out.println(num1);

            }
        }
        Inner inner=new Inner();
        inner.show();
    }
}
