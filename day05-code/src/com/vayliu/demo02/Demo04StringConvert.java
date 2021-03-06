package com.vayliu.demo02;

/*
String当中与转换相关的方法：

public char[] toCharArray()：将当前字符串拆分成为字符数组作为返回值。
public byte[] getBytes()：获得当前字符串底层的字节数据。
public String replace(CharSequence old String, CharSequence newString)：将所有出现的老字符串替换成为新的字符串，返回替换后的结果新字符串。
备注：CharSequence意思就是说可以接受字符串类型。
 */
public class Demo04StringConvert {

    public static void main(String[] args) {

        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);   //H
        System.out.println(chars.length);   //5
        System.out.println("==============");

        //转换成为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("==============");

        String str1 = "How do you do?";
        String str2 = str1.replace("o", "*");
        System.out.println(str1);   //How do you do?
        System.out.println(str2);   //H*w d* y*u d*?
        System.out.println("==============");

        String lang1 = "会不会玩啊！你大爷的！你大爷的！你大爷的！！！";
        String lang2 = lang1.replace("你大爷的", "****");
        System.out.println(lang1);
        System.out.println(lang2);
    }

}
