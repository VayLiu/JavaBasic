package com.vayliu.demo03;

/*
如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类。多个对象共享同一份数据
 */
public class Demo01StaticField {

    public static void main(String[] args) {

        Student stu1 = new Student("郭靖", 19);
        Student stu2 = new Student("黄蓉", 16);
        stu1.room = "101教室";

        System.out.println("姓名：" + stu1.getName() +
                " 年龄：" + stu1.getAge() +
                " 教室：" + stu1.room +
                " 学号：" + stu1.getId());
        System.out.println("姓名：" + stu2.getName() +
                " 年龄：" + stu2.getAge() +
                " 教室：" + stu2.room +
                " 学号：" + stu2.getId());

    }

}
