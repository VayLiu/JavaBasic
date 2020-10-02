package com.vayliu.demo02;

public class Zi extends Fu {

    int numZi = 20;

    int num = 200;

    public void methodZi() {
        //因为本类当中有 num ，所以这里使用的是本类的num
        System.out.println(num);
    }

}
