package com.vayliu.demo01;

import java.util.Scanner;

/*
键盘输入三个数字，然后求出其中的最大值。

思路：
1. 简然是键盘输入，肯定需要使用Scanner
2. Scanner三个步骤：导包、创建、使用
3. 既然是三个数字，那么需要调用三次nextInt()方法，得到三个int变量
4. 无法同时判断三个数字谁最大，应该转换成为两个步骤：
    4.1 首先判断前两个谁当中谁最大，拿到前两个的最大值
    4.2 拿着前两个的最大值，在和第三个数字比较，得到三个数字当中的最大值
5. 打印最终结果
 */
public class Demo03ScannerMax {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = scanner.nextInt();
        System.out.println("请输入第三个数字：");
        int num3 = scanner.nextInt();

        //首先得到前两个数字的最大值
        int temp = num1 > num2 ? num1 : num2;
        int max = temp > num3 ? temp : num3;
        System.out.println("三个数的最大值为：" + max);

    }

}
