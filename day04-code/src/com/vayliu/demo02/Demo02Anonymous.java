package com.vayliu.demo02;

import java.util.Scanner;

/*
匿名对象作为方法参数
 */
public class Demo02Anonymous {

    public static void main(String[] args) {

        //普通使用方式
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();

        //匿名对象方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的是：" + num);

        //适用一般写法传入参数
//        Scanner scanner = new Scanner(System.in);
//        methodParam(scanner);

        //使用匿名对象来进行传参
//        methodParam(new Scanner(System.in));

        //使用匿名对象作为返回值
        Scanner scanner = methodReturn();
        int num = scanner.nextInt();
        System.out.println("输入的是：" + num);
    }

    private static void methodParam(Scanner scanner) {
        int num = scanner.nextInt();
        System.out.println("输入的是：" + num);
    }

    private static Scanner methodReturn() {
//        Scanner scanner = new Scanner(System.in);
//        return scanner;

        return new Scanner(System.in);
    }

}
