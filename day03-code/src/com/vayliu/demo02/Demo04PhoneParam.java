package com.vayliu.demo02;

/*
使用对象类型作为方法参数
 */
public class Demo04PhoneParam {

    public static void main(String[] args) {

        Phone phone = new Phone();
        phone.brand = "苹果";
        phone.price = 8388.0;
        phone.color = "土豪金";

        method(phone);//传递进去的参数其实就是地址值

    }

    public static void method(Phone phone){
        System.out.println(phone.brand);    //苹果
        System.out.println(phone.price);    //8388.0
        System.out.println(phone.color);    //土豪金
    }

}
