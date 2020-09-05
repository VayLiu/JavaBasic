package com.vayliu.demo03;

/*
对于基本类型当中的boolean值，Getter方法一定要写成isXxx的形式，而setXxx规则不变。
 */
public class Student {

    private String name;    //姓名
    private int age;    //年龄
    private boolean male;   //是不是爷们儿



    public String getName() {
        return name;
    }

    public void setName(String str) {
        name = str;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int num) {
        age = num;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean b) {
        male = b;
    }
}
