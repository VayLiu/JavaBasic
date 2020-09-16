package com.vayliu.demo03;

import java.util.Random;

/*
Random类来生成随机数字。使用起来也是三个步骤：
1. 导包（API文档包）
import java.util.Random;

2. 创建（API文档构造方法）
Random r = new Random();    //小括号当中留空即可

3. 使用（API文档成员方法）
获取一个随机的int数字（范围是int所有范围，有正负两种）：int num = r.nextInt();

获取一个随机的int数字（参数代表了范围，左闭右开区间）：int num = r.nextInt(3);
实际代表的含义是：[0,3)，也就是范围是：0~2
 */
public class Demo01Random {

    public static void main(String[] args) {

        Random r = new Random();
        int num = r.nextInt();
        System.out.println("随机数是：" + num);
    }

}
