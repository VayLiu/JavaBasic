package com.vayliu.demo03;

import java.util.Random;

/*
题目要求：
根据int变量n的值，来获取随机数字，范围是[1,n]，可以去到1也可以去到n。

思路：
1. 定义一个变量n，随意赋值。
2. 要使用Random：三个步骤：导包、创建、使用
3. 如果写10，那么[0,9)，然而想要的是[1,10] -- 可以发现：整体+1即可
4. 打印随机数字
 */
public class Demo03Random {

    public static void main(String[] args) {

        int n = 5;
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            int result = r.nextInt(n) + 1;  //本来范围是[0,n)，整体+1后变成了[1,n+1)，也就是[1,n]
            System.out.println(result);
        }

    }

}
