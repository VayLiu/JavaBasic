package com.vayliu.demo01;

/*
通常情况下，一个类并不能直接使用，需要根据类创建一个对象才能使用。

如何创造一个对象？
1. 导包：也就是指出需要使用的类在什么位置。
格式：
    import 名称 类名称;
例如：
    import com.vayliu.demo01.Student;
【对于和当前类属于同一个包的情况下，可以省略导包语句不写】

2. 创建
格式：
    类名称 对象名 = new 类名称();
例如：
    Student student = new Student();

3. 使用（分为两种情况）
 - 使用成员变量：对象名.成员变量名
 - 使用成员方法：对象名.成员方法名
【也就是，想用谁就用对象名点谁】

注意事项：
如果成员变量没有进行复制，那么将会有一个默认值，规则和数组一样。
 */
public class Demo02Student {

    public static void main(String[] args) {

        //1.导包
        //我需要一个Student类，和我的Demo02Student位于同一个包下，所以省略不写

        //2.创建
        //类名称 对象名 = new 类名称();
        //根据类名称创建一个名为student的对象
        Student student = new Student();

        //3.使用其中的成员变量
        //对象名.成员变量名
        System.out.println(student.name); //null
        System.out.println(student.age); //0
        System.out.println("====================");

        //改变对象当中的成员变量数值内容
        //右侧的字符串，赋值交给student对象当中的name成员变量
        student.name = "赵丽颖";
        student.age = 18;
        System.out.println(student.name); //赵丽颖
        System.out.println(student.age); //18
        System.out.println("====================");

        //4.使用对象的成员方法
        //对象名.成员方法名
        student.eat();
        student.sleep();
        student.study();

    }

}
