package com.neibulei.itheima_08;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/16 18:58
 */
public class Other {
    private int num = 10;

    public void method() {

        class Inner {
            public void show() {
                System.out.println(num);
            }
        }
        Inner inner=new Inner();
        inner.show();
    }
}
