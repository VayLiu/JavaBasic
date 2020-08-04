package com.vayliu.demo03;

/*
求数组中的最大值。

可以将整个过程看做为一场【比武招亲】，那么数组内各元素便可作为各选手战斗力。
每个选手需要在擂台中进行比武，只有战斗力强的才能待在比武擂台中。
第一个选手先站在比武擂台中，然后剩下的每个选手依次进行比武。
最后战斗力最强的选手留在台上。
 */
public class Demo05ArrayMax {

    public static void main(String[] args) {

        int[] array = { 5, 15, 30, 20, 10000, 30, 35 };

        int max = array[0];//比武擂台
        for (int i = 1; i < array.length; i++) {
            //如果当前元素的值，比max更大，则换人
            if (array[i] > max){
                max = array[i];
            }
        }
        //谁最厉害，就能在max当中留下谁的战斗力
        System.out.println("最大值：" + max);
    }

}
