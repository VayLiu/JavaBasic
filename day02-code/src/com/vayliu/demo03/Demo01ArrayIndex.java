package com.vayliu.demo03;

/*
数组的索引编号从0开始，一直到“数组的长度-1”为止

如果访问数组元素的时候，索引编号不存在，那么将会发生：
数组索引越界异常 ArrayIndexOutOfBoundException

问题原因：索引编号写错了。
解决方案：修改成为存在的正确索引编号。
 */
public class Demo01ArrayIndex {

    public static void main(String[] args) {

        int[] array = { 15, 25, 35 };

        System.out.println(array[0]);//15
        System.out.println(array[1]);//25
        System.out.println(array[2]);//35

        System.out.println(array[3]);

    }

}
