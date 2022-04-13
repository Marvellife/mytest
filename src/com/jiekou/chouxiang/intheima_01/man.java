package com.jiekou.chouxiang.intheima_01;

import com.jiekou.chouxiang.Person;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/3/23 18:39
 */
public abstract  class man extends Person {

    //这个方法的访问修饰符是默认的default。也就是包访问权限，非同包子类无法访问
    //所以man无法实现父类的全部抽象方法，也需要定义为抽象类
  /*  public void test() {

    }*/


//    参数列表。方法名相同。返回类型小于等于父类的返回类型。抛出的异常要范围要小于等于父类。访问修饰符权限大于或等于父类。
    @Override
     public void test1() {
    }
}
