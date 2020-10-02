package com.vayliu.demo09;

/*
super 关键字用来访问父类内容，而 this 关键字用来访问本类内容。用法也有三种：

1. 在本类的成员方法中，访问本类的成员变量。
2. 在本类的成员方法中，访问本类的另一个成员方法。
3. 在本类的构造方法中，访问本类的另一个构造方法。

在第三中用法当中要注意：
 - this(...)调用也必须是构造方法的第一个语句，唯一一个。
 - super 和 this 两种构造调用，不能同时使用。
 */
public class Zi extends Fu {

    int num = 20;

    public Zi() {
        this(123);  //本类的无参构造调用本类的有参构造
//        this(1,2);  //错误写法
    }

    public Zi(int n) {
        this(1, 2);
    }

    public Zi(int n, int m) {

    }

    public void showNum() {
        int num = 10;
        System.out.println(num);    //局部变量
        System.out.println(this.num);   //本类中的成员变量
        System.out.println(super.num);  //父类中的成员变量
    }

    public void methodA() {
        System.out.println("AAA");
    }

    public void methodB() {
        this.methodA();
        System.out.println("BBB");
    }

}
