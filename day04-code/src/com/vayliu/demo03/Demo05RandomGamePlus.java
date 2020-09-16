package com.vayliu.demo03;

import java.util.Random;
import java.util.Scanner;

/*
在猜数字的基础上，加上猜测次数限制：
    如果猜测次数超过10次，则游戏失败，直接结束

思路：
将循环由while(true)改成for(int i=10; i>0; i--)

 */
public class Demo05RandomGamePlus {

    public static void main(String[] args) {

        int randomNum = new Random().nextInt(100) + 1; //[1,100]
        Scanner scanner = new Scanner(System.in);
        int num;
        for (num = 10; num > 0; num--) {
            System.out.println("（剩余次数：" + num + "）请输入你猜测的数字：");
            int getNum = scanner.nextInt();    //键盘猜测的数字

            if (getNum > randomNum) {
                System.out.print("太大了");
                if (num > 1)
                    System.out.println("，请重试。");
            } else if (getNum < randomNum) {
                System.out.print("太小了");
                if (num > 1)
                    System.out.println("，请重试。");
            } else {
                System.out.println("恭喜你，猜中啦！");
                break;  //如果猜中，不再重试
            }
        }

        if (num == 0) {
            System.out.println("\n游戏失败！");
        } else {
            System.out.println("游戏结束。");
        }

    }

}
