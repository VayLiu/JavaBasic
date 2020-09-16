package com.vayliu.demo01;

import java.util.Scanner;

/*
键盘输入两个int数字，并输出和值

思路：
1. 既然需要键盘输入，那么就需要用到Scanner
2. Scanner的三个步骤：导包、创建、使用
3. 需要的是两个数字，所以要调用连词nextInt方法
4. 得到了两个数字，就需要加在一起。
5. 将结果打印输出。
 */
public class Demo02ScannerSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = scanner.nextInt();
        int result = num1 + num2;
        System.out.println("两数字之和为：" + result);
    }

}
