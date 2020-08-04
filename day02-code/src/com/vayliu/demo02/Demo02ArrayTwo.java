package com.vayliu.demo02;

/*
两个数组在内存中实现过程
讲解视频：https://www.bilibili.com/video/BV1R7411x7Xi?p=86
 */
public class Demo02ArrayTwo {

    public static void main(String[] args) {

        int[] arrayA = new int[3];
        System.out.println(arrayA);//地址值
        System.out.println(arrayA[0]);//0
        System.out.println(arrayA[1]);//0
        System.out.println(arrayA[2]);//0
        System.out.println("===========");

        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA);//地址值
        System.out.println(arrayA[0]);//0
        System.out.println(arrayA[1]);//10
        System.out.println(arrayA[2]);//20
        System.out.println("===========");

        int[] arrayB = new int[3];
        System.out.println(arrayB);//地址值
        System.out.println(arrayB[0]);//0
        System.out.println(arrayB[1]);//0
        System.out.println(arrayB[2]);//0
        System.out.println("===========");

        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayB);//地址值
        System.out.println(arrayB[0]);//0
        System.out.println(arrayB[1]);//100
        System.out.println(arrayB[2]);//200
    }

}