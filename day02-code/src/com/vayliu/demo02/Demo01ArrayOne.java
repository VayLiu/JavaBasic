package com.vayliu.demo02;

/*
一个数组在内存中实现过程
讲解视频：https://www.bilibili.com/video/BV1R7411x7Xi?p=85
 */
public class Demo01ArrayOne {

    public static void main(String[] args) {

        //动态初始化
        int[] array = new int[3];
        System.out.println(array);//内存地址值
        System.out.println(array[0]);//0
        System.out.println(array[1]);//0
        System.out.println(array[2]);//0
        System.out.println("===========");

        //改变数组当中元素的内容
        array[1] = 10;
        array[2] = 20;
        System.out.println(array);//内存地址值不变
        System.out.println(array[0]);//0
        System.out.println(array[1]);//10
        System.out.println(array[2]);//20

    }

}
