package com.jihe.itheima_17;

import java.util.ArrayList;
import java.util.List;

/**
 * 类功能描述
 *  泛型接口测试
 * @Author Administrator
 * @Date 2022/1/21 20:59
 */

/*类型通配符 <?> 任意类型

类型通配符上限<?extends 类型>  List<? extends Number>:它表示的类型是Number或者其子类型

类型通配符的下限<? super 类型> List<? super Number>: 它表示的类型是Number或者其父类型*/
public class GenericDemo05 {
    public static void main(String[] args) {
        //类型通配符 <?>
        List<?> list1 = new ArrayList<Object>();
        List<?> list2 = new ArrayList<Number>();
        List<?> list3 = new ArrayList<Integer>();

        //类型通配符上限<?extends 类型>
        List<? extends Number> list5 = new ArrayList<Number>();
        List<? extends Number> list6 = new ArrayList<Integer>();

        //类型通配符的下限<? super 类型>
        List<? super Number> list7 = new ArrayList<Object>();
        List<? super Number> list8 = new ArrayList<Number>();

    }
}
