package com.jihe.itheima_17;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/21 20:34
 */
/* public class Generic3 {
   public void show(String s) {
        System.out.println(s);
    }

    public void show(Integer s) {
        System.out.println(s);
    }

    public void show(Boolean s) {
        System.out.println(s);
    }
}*/
//泛型类改进

public class Generic3<T>{
        public void show(T t) {
        System.out.println(t);
    }
}

//泛型方法改进
/*
public class Generic3 {
    public <T> void show(T t){
        System.out.println(t);
    }
}*/
