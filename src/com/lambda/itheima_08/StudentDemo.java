package com.lambda.itheima_08;

/**
 * 类功能描述
 *      引用构造器
 * @Author Administrator
 * @Date 2022/2/21 23:42
 */
public class StudentDemo {
    public static void main(String[] args) {
       useStudentBuilder(new StudentBuilder() {
            @Override
            public Student build(String name, int age) {
                Student student = new Student(name,age);
                return student;
            }
        });

        useStudentBuilder(new StudentBuilder() {
            @Override
            public Student build(String name, int age) {
                return new Student(name,age);
            }
        });
        useStudentBuilder((mame,age)->new Student());

        useStudentBuilder(Student::new);
    }
    public static void useStudentBuilder(StudentBuilder studentBuilder){
        Student student=studentBuilder.build("王强",15);
        System.out.println(student);
    }

}
