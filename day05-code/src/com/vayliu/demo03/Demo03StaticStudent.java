package com.vayliu.demo03;

public class Demo03StaticStudent {

    public static void main(String[] args) {

        //首选设置一下教室，这是静态的东西，应该通过类名称进行调用
        Student.room = "101教室";

        Student stu1 = new Student("郭靖", 20);
        System.out.println("stu1的姓名：" + stu1.getName());
        System.out.println("stu1的年龄：" + stu1.getAge());
        System.out.println("stu1的教室：" + Student.room);
        System.out.println("=============");

        Student stu2 = new Student("黄蓉", 18);
        System.out.println("stu1的姓名：" + stu2.getName());
        System.out.println("stu1的年龄：" + stu2.getAge());
        System.out.println("stu1的教室：" + Student.room);
    }

}
