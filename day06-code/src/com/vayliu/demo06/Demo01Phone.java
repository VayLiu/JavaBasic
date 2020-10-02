package com.vayliu.demo06;

/*
继承中方法覆盖重写的应用

老款手机功能：
 - 打电话
 - 发短信
 - 来电显示：
    - 显示号码

新款手机功能：
 - 打电话
 - 发短信
 - 来电显示：
    - 显示号码
    - 显示姓名
    - 显示头像

设计原则：（继承）
对于已经投入使用的类，尽量不要进行修改。
推荐定义一个新的类，来重复利用其中共性内容，并添加改动新内容。
 */
public class Demo01Phone {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("==========");

        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.send();
        newPhone.show();
    }

}
