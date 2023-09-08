package com.baiyikong.objectdemo;

public class ObjectDemo1 {
    public static void main(String[] args) {
        //练习一下object的常用方法

        String s = "test";
        Class<? extends String> sClass = s.getClass();
        System.out.println(sClass);
        int hashCode = s.hashCode();
        System.out.println(hashCode);

    }
}
