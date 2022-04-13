package com.tools.itheima_13;

/**
 * 类功能描述
 *  1.int 转为String
 *  2.String-->Integer-->Int\
 *  3.字符串中数据排序
 * @Author Administrator
 * @Date 2022/1/16 23:32
 */
public class IntegerDemo {
    public static void main(String[] args) {
/*        Integer i1 = new Integer(100);//已过时
        System.out.println(i1);
        Integer i2 = new Integer("100");//已过时
        System.out.println(i2);
        Integer i3=Integer.valueOf(100);
        System.out.println(i3);
        Integer i4=Integer.valueOf("100");
        System.out.println(i4);*/

        //int 转为String
        //方法一：
        int number=100;
        //字符串在前做字符拼接
        String s1=""+number;
        //当遇到字符串且字符串在前，+号就回被用作字符串的拼接。字符串前面的数据则会做运算。
        //String s1=300+100+"a"+number;//输出400a100
        System.out.println(s1);
        //方法二：调用方法
        String s2=String.valueOf(number);
        System.out.println(s2);


        System.out.println("-------------------");
        //String-->Integer-->Int\
        //方法一：
        String s="100";
        Integer i=Integer.valueOf(s);
        int x=i.intValue();
        System.out.println(x);
        //方法二：
        String s0="100";
        int y=Integer.parseInt(s0);
        System.out.println(y);
        System.out.println(s==s0);
        System.out.println(y==number);


        //字符串中的数据排序。
        String s3="91 27 46 38 50";
        String[] arr=s3.split(" ");
        int[] arr1=new int[arr.length];
        for(int j=0;j<arr.length;j++){
            arr1[j]=Integer.parseInt(arr[j]);
        }

        //排序
        //方法一:
        //Arrays.sort(arr1);
        //方法二：冒泡排序
        for(int m=0;m<arr1.length-1;m++){
            for(int n=0;n<arr1.length-1-m;n++){
                if(arr1[m]>arr1[m+1]){
                    int temp=arr1[m+1];
                    arr1[m+1]=arr1[m];
                    arr1[m]=temp;
                }
            }
        }
        //数组转字符串
        //方法一：
        //String a=Arrays.toString(arr1);
        //System.out.println(a);
        //方法二：
        StringBuilder sb=new StringBuilder();
        for(i =0;i< arr1.length;i++){
            if(i== arr1.length-1){
                sb.append(arr1[i]);
            }
            else{
                sb.append(arr1[i]+",");
            }

        }
        System.out.println(sb);

    }
}
