package com.baiyikong.switchdemo;

public class SwitchDemo1 {
    public static void main(String[] args) {
        int temp = 3;
        switch (temp){
            case 1:
                System.out.println(temp);
                break;
            case 2:
                System.out.println(temp-1);
                break;
            default:
                System.out.println("sb");
                break;
        }
    }
}
