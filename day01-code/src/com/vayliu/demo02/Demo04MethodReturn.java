package com.vayliu.demo02;

/*
题目要求：定义一个方法，求出两个数字之和。
题目解析：你帮我算，算完把结果告诉我。
 */
public class Demo04MethodReturn {

    public static void main(String[] args) {
        //我是main方法，我来调用你。
        //我调用你，你帮我计算一下，算完之后把结果告诉我的num变量
        int num = getSum(10,20);
        System.out.println("返回值是：" + num);
    }

    //我是一个方法，我负责两个数字相加。
    //我有一个返回值int，谁调用我，我就把计算结果返回给谁
    public static int getSum(int a, int b) {
        int result = a + b;
        return result;
    }
}
