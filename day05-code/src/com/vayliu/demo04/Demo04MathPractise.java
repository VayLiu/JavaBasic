package com.vayliu.demo04;

/*
题目：
计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？

分析：
1. 既然已经确定了范围，for循环
2. 起点位置-10.8应该转换成为-10，两种办法：
    2.1 可以使用Math.ceil方法，向上（向正方向）取整
    2.2 强转成为 int，主动舍去所有小数位
3. 每一个数字都是整数，所以步进表达式应该是i++，这样每次都是+1的。
4. 如何拿到绝对值，Math.abs()方法。
5. 一旦发现了一个数字，需要让计数器++进行统计。

备注：使用Math.ceil()方法，-10.8可以变成-10.0，注意double值也是可以进行++的。
 */
public class Demo04MathPractise {

    public static void main(String[] args) {

        int count = 0;
        double min = -10.8;
        double max = 5.9;

        //这样处理，变量i就是区间之内所有的整数
        for (double i = (int) Math.ceil(min); i < max; i++) {
            double numAbs = Math.abs(i);   //绝对值
            if (numAbs > 6 || numAbs < 2.1) {
//                System.out.println(i);
                count++;
            }
        }

        System.out.println("总共有：" + count + "个");     //9
    }

}
