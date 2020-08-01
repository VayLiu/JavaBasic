package com.vayliu.demo02;

/**
 * 打印输出 5×20的矩阵
 */
public class Demo01Method {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
