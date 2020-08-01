package com.vayliu.demo03;

/*
题目要求：定义一个方法：用来判断两个数字是否相同
 */
public class Demo01MethodSame {

    public static void main(String[] args) {
        System.out.println(isSame(10,20));//false
        System.out.println(isSame(20,20));//true
    }

    /*
    三要素：
        返回值类型：boolean
        方法名称：isSame
        参数列表：int a, int b
     */
    public static boolean isSame(int a, int b) {

        /* 第一种方法：if判断
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
         */

        /* 第二种方法：条件运算符
        boolean same = a == b ? true : false;
         */
        /* 第三种方法：直接判断
        boolean same = a == b;
         */

        return a == b;
    }

}
