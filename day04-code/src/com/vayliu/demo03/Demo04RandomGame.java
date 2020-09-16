package com.vayliu.demo03;

import java.util.Random;
import java.util.Scanner;

/*
题目：用代码模拟猜数字的小游戏。

思路：
1. 首先需要残生一个随机数字，并且一旦产生不再变化。用Random的nextInt方法
2. 需要键盘输入，所以用到了Scanner
3. 获取键盘输入的数字，用Scanner中的nextInt方法
4. 已经得到了两个数字，判断（if）一下：
    如果太大了，提示太大了，并且重试；
    如果太小了，提示太小了，并且重试；
    如果猜中了，游戏结束。
5. 重试就是再来一次，循环次数不确定，用while(true)。

 */
public class Demo04RandomGame {

    public static void main(String[] args) {

        int randomNum = new Random().nextInt(100) + 1; //[1,100]
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请输入你猜测的数字：");
            int getNum = scanner.nextInt();    //键盘猜测的数字

            if (getNum > randomNum) {
                System.out.println("太大了，请重试。");
            } else if (getNum < randomNum) {
                System.out.println("太小了，请重试。");
            } else {
                System.out.println("恭喜你，猜中啦！");
                break;  //如果猜中，不再重试
            }
        }

        System.out.println("游戏结束。");

    }

}
