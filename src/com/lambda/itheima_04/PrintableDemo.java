package com.lambda.itheima_04;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/21 22:26
 */
public class PrintableDemo {
    public static void main(String[] args) {

        usePrintable(s-> System.out.println(s));
        //方法引用就是lambda的兄弟
        //方法引用符 ：：可推导出来才可以使用
        //如果使用lambda，那么根据可推导就可以省略，
        usePrintable(System.out::println);


    }

    private static void usePrintable(Printable p){
        p.printString("测试");
    }
}
