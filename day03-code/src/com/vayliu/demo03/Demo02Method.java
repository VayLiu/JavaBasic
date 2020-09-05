package com.vayliu.demo03;

/*
面向对象三大特征：封装、继承、多态

封装性在Java当中的体现：
1. 方法就是一种封装
2. 关键字private也是一种封装

封装就是将一些细节信息隐藏起来，对外界不可见。
 */
public class Demo02Method {

    public static void main(String[] args) {
        int[] array = {5, 15, 25, 55, 60, 20};

        int max =  getMax(array);
        System.out.println("最大值：" + max);
    }

    //给我一个数组，我还你一个最大值
    public static int getMax(int[] array) {
        int max =  array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

}
