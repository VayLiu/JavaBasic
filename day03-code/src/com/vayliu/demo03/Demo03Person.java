package com.vayliu.demo03;

public class Demo03Person {

    public static void main(String[] args) {

        Person person = new Person();
        person.show();

        person.name = "赵丽颖";
//        person.age = -18;   //直接访问private内容，错误写法！
        person.setAge(20);
        person.show();

    }

}
