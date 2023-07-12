package com.baiyikong.stringdemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("小羊");
        sb.append(19);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);
    }
}
