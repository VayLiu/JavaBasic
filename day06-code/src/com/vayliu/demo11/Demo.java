package com.vayliu.demo11;

/*
1. Java 语言是**单继承**的。
单继承：一个类的直接父类只有唯一一个。

class A {}
class B extends A {} //正确
class C {}
class D extends A,C {}  //错误

2. Java 语言可以**多级继承**。
我有一个父亲，我父亲还有一个父亲，也就是爷爷。

class A{}
class B extends A{} //正确
class C extends B{} //正确

A是B的父类
B是C的父类
A是C的父类（不是直接父类）

3. 一个子类的直接父类是惟一的，但是一个父类可以拥有很多子类。
可以有很多个兄弟姐妹，生二（多）胎。

class A{}
class B extends A {}    //正确
class C extends A {}    //正确

 */
public class Demo {

    public static void main(String[] args) {


    }

}
