package com.baiyikong.stringdemo;

public class StringDemo3 {
    public static void main(String[] args) {
        //练习一下字符串的基本操作
        String s = "小老虎";
        byte[] b = {97,98,99};
        String s2 = new String(b);
        System.out.println(s2);
    }
}
