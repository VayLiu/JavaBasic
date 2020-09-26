package com.vayliu.demo04;

import java.util.Arrays;

/*
题目：
请使用Arrays相关的API，将一个随机字符串的所有字符升序排列，并倒序打印。
 */
public class Demo02ArraysPractise {

    public static void main(String[] args) {

        String str = "sahjkdjsak4sd5a";

        //如何进行升序排列，sort
        //必须是一个数组才能用Arrays.sort方法
        //String --> 数组，才能用toCharArray
        char[] arrayStr = str.toCharArray();
        Arrays.sort(arrayStr);  //对字符数组进行升序排列

        //需要倒序遍历
        for (int i = arrayStr.length - 1; i >= 0; i--) {
            System.out.print(arrayStr[i]);
        }
        System.out.println();

    }

}
