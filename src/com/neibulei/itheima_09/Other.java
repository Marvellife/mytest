package com.neibulei.itheima_09;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/16 18:58
 */
public class Other {
    public void method() {
        //匿名内部类本质是一个没有名字的对象
/*        new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };*/
       /* new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();*/////匿名内部类本质是一个没有名字的对象,这里是一个对象调用了show()方法
        //如果需要多次调用show方法，怎么办呢?
        //再次说明匿名内部类的本质还是一个对象，实现了接口的show方法
       Inter inter= new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
       inter.show();
       inter.show();
    }
}
