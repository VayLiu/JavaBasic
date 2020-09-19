package com.vayliu.demo05;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
生成6个1~33之间的随机整数，添加到集合，并遍历集合。

思路：
1. 需要存储6个数字，创建一个集合ArrayList<Integer>
2. 产生随机数，需要用到Random
3. 用循环6次来产生6个随机数字：for循环
4. 循环体内需要调用Random.nextInt(int n)方法，参数33(0~32)，整体+1才是1~33
5. 把数字添加到集合中：add
6. 遍历集合：for、size()、get()
 */
public class Demo01ArrayListRandom {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            int num = random.nextInt(33) + 1;
            list.add(num);
        }

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

}
