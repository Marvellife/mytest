package com.neibulei.itheima_07;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/16 18:58
 */
public class Other {
    private int outNum = 10;

    public static void show2(){
        System.out.println("外部类的静态方法");
    }

    public void show1() {
        System.out.println("外部类方法show1");
        //内部类访问外部类的成员变量可以直接访问,外部类访问内部类的成员变量需要创建对象
        System.out.println("外部类访问内部类变量" + new Inner().innerNum);
    }

    //成员内部类类比成员方法
    public class Inner {
        private int innerNum = 11;
        public void show() {
            System.out.println("内部类的方法show");
            //内部类访问外部类的成员变量可以直接访问,外部类访问内部类的成员变量需要创建对象
            System.out.println("内部类访问外部类变量" + outNum);
            //  内部类可以直接访问外部类的方法,也可以通过创建外部类对象调用,如果内部类和外部类方法同名,默认调用内部类的
            show1();
            show2();
            Other other = new Other();
            other.show1();
            //内部类使用外部类的隐藏的this对象
            Other.this.show1();
            System.out.println(Other.this.outNum);
            System.out.println(this.innerNum);

            //外部类的静态方法属于类方法,可以通过内名调用
            //内部类没有静态方法
            Other.show2();


            ;
        }
        //内部类没有静态方法
        /*public static void show2() {
            System.out.println("内部类静态方法show2");
        }*/
        public void show1() {
            System.out.println("内部类方法show1");
        }
        public void show3() {
            System.out.println("内部类方法show3");
        }
    }
}
