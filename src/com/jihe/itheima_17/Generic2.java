package com.jihe.itheima_17;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/21 20:34
 */
public class Generic2<T>{
    private T t;

    public Generic2() {
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public Generic2(T t) {
        this.t = t;
    }
}
