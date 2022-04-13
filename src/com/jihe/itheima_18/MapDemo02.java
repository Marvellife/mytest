package com.jihe.itheima_18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 类功能描述
 *
 * @Author Administrator
 * @Date 2022/1/21 22:31
 */
public class MapDemo02 {
    public static void main(String[] args) {
        Student s1=new Student("lilei",11);
        Student s2=new Student("wangqiang",12);
        Student s3=new Student("sunhong",13);
        Student s4=new Student("zhaomin",14);
        //map键相同，值覆盖。
        Map<String,Student> map = new HashMap<String,Student>();
        map.put("101",s1);
        map.put("102",s2);
        map.put("103",s3);
        map.put("104",s4);

        Set<Map.Entry<String,Student>> set =map.entrySet();
        for (Map.Entry<String, Student> stringStudentEntry : set) {
            //System.out.println(stringStudentEntry.getValue().toString());
            Student s =stringStudentEntry.getValue();
            System.out.println(stringStudentEntry.getKey()+","+s.getStuName()+","+s.getAge());
        }


    }
}
