package com.baiyikong.objectdemo;

import java.util.ArrayList;
import java.util.List;

public class ObjectDemo2 {
    public static void main(String[] args) {
        //object的常用方法
        //获取到类   hashcode   wait  finalize   equals  tostring


        List<String> l = new ArrayList<>();
        l.add("1");
        l.add("1");
        l.add("1");

        Class<? extends List> lClass = l.getClass();
        System.out.println(lClass);
    }
}
