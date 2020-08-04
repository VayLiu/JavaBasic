package com.vayliu.demo03;

/*
求数组中的最小值。
 */
public class Demo06ArrayMin {

    public static void main(String[] args) {

        int[] array = { 5, 15, 30, 20, 10000, -20, 30, 35 };

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            //如果当前元素的值，比min更小，则换人
            if (array[i] < min){
                min = array[i];
            }
        }

        System.out.println("最小值：" + min);
    }

}
