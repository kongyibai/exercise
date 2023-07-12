package com.baiyikong.stringdemo;

import java.util.Scanner;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        //输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();

        //反转
        String result = new StringBuilder().append(str).reverse().toString();
        //比较
        if(str.equals(result)){
            System.out.println("1");
        }
        else {
            System.out.println("2");
        }
    }
}
