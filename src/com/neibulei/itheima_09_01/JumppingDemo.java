package com.neibulei.itheima_09_01;

/**
 * 类功能描述
 *匿名内部类的使用
 * @Author Administrator
 * @Date 2022/1/16 20:05
 */
public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator jo=new JumppingOperator();
        Jumpping j=new Cat();
        jo.method(j);

        Jumpping j2=new Dog();
        jo.method(j2);
        System.out.println("-----------");
        System.out.println("简化后的，不用多余创建两个类，这就是匿名内部类的作用");
        jo.method(
                new Jumpping() {
                    @Override
                    public void jump() {
                        System.out.println("猫咪可以跳高了");
                    }
                }
        );
        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("狗可以跳高了");
            }
        });
    }
}
