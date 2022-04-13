package com.fanshe.itheima_07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/2/23 0:06
 */
public class Test03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
/*        Student s = new Student();
        s.study();*/
/*        Teacher teacher = new Teacher();
        teacher.teacher();*/
        //Properties在320节课
        Properties properties = new Properties();
        FileReader fileReader = new FileReader("idea_test\\class.txt");
        properties.load(fileReader);
        fileReader.close();
        //获取配置文件
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        //通过反射来使用
        Class<?> aClass = Class.forName(className);
        Constructor<?> con = aClass.getConstructor();
        Object o = con.newInstance();
        Method study = aClass.getDeclaredMethod(methodName);
        study.invoke(o);
    }
}
