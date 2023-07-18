package com.baiyikong.interfacedemo;

import java.util.ArrayList;
import java.util.function.Consumer;

public class InterFaceDemo1 {
    public static void main(String[] args) {
        //练习使用匿名内部类，和lambda表达式
        //lambda表达式  格式 ()->{}
        //匿名内部类本质是创建一个没有名字的类，简化代码
        //lambda表达式本质上是关注函数式，做的事情本身，继续简化代码。
        // 创建类和重写方法的代码也进行省去，通过特殊的格式来标识是为lambda表达式

        ArrayList<String> arr = new ArrayList<>();
        arr.add("111");
        arr.add("12");
        arr.add("121");
        arr.add("21");
        arr.add("211");

        //匿名内部类的形式
        System.out.println("匿名内部类的形式");
        arr.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        //lambda表达式形式
        System.out.println("lambda表达式形式");
        arr.forEach((String s) -> {
            System.out.println(s);
        });
        //还可以继续简化,形参的类型可以省略，只有一个参数小括号可以省略，只有一行代码大括号可以省略
        System.out.println("还可以继续简化");
        arr.forEach(s -> System.out.println(s));
    }
}
