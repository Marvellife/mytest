package com.lambda.itheima_06;

import java.util.Locale;

/**
 * 类功能描述
 *      引用对象的实例方法
 * @Author Administrator
 * @Date 2022/2/21 23:00
 */
public class PrinterDemo {
    public static void main(String[] args) {
        //匿名内部类
        usePrinter(new Printer() {
            @Override
            public void printUpperCase(String s) {
                /*String result = s.toUpperCase();
                System.out.println(result)*/;

                System.out.println(s.toUpperCase());
            }
        });
        //lambda表达式
        usePrinter(s -> {
           /* String result = s.toUpperCase();
            System.out.println(result);*/
            System.out.println(s.toLowerCase());
        });
        //usePrinter(PrintString::printUpper);//这种方法需要把printUpper定义为static
        usePrinter(new PrintString()::printUpper);

        PrintString printString = new PrintString();
        usePrinter(printString::printUpper);
    }

    public static void usePrinter(Printer p) {
        p.printUpperCase("HelloWorld");
    }
}
