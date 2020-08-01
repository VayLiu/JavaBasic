package com.vayliu.demo03;

/*
题目要求：定义一个方法，用来打印指定次数的HelloWorld
 */
public class Demo03MethodPrint {

    public static void main(String[] args) {
        printCount(5);
    }


    /*
    三要素：
        返回值：知识进程一大堆打印操作，没有计算，也有要结果要告诉调用处，因此无返回值
        方法名称：printCount
        参数列表：到底要打印多少次？必须要告诉我，否则不知道多少次，没法打印。次数：int
     */
    public static void printCount(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("HelloWorld" + (i + 1));
        }
    }
}
