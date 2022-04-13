package com.myenum;

public enum MyEnum {
    MON,TUE,WED,THUR,FRI,SAT,SUN;

    public static void main(String[] args) {
        //枚举取值
        System.out.println(MyEnum.MON);
        System.out.println(MyEnum.TUE);
        System.out.println(MyEnum.WED);
        //枚举遍历
        for (MyEnum value : MyEnum.values()) {
            System.out.println(value);
        }
    }
}
