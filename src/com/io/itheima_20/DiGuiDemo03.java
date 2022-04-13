package com.io.itheima_20;

import java.io.File;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/30 9:52
 */
public class DiGuiDemo03 {
    public static void main(String[] args) {
        //根据给定的路径创建一个File对象
        File srcFile = new File("D:\\itcast");
        getAllFilePath(srcFile);
    }
    //定义一个方法，用于获取指定目录下的所有内容，参数为第一步创建的File对象
    public static void getAllFilePath(File srcFile){
        System.out.println("111111111111");
        //获取给定的File目录下的所有文件或者目录的File数组
        File[] fileArray= srcFile.listFiles();
        //遍历该数组得到每一个File对象
        if(fileArray!=null){
            for(File file:fileArray){
                //判断该对象是否为目录
                if(file.isDirectory()){
                    //是目录则遍历这个目录
                    getAllFilePath(file);
                }
                else {
                    //不是目录,这输出这个对象的绝对路径
                    System.out.println(file.getAbsoluteFile());
                }
            }
        }
    }
}
