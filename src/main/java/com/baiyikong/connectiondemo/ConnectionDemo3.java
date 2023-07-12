package com.baiyikong.connectiondemo;

import java.util.ArrayList;

public class ConnectionDemo3 {
    public static void main(String[] args) {
        //1
        Phone p1 = new Phone("小米",1000);
        Phone p2 = new Phone("苹果",8000);
        Phone p3 = new Phone("锤子",2999);
        Phone p4 = new Phone("小羊",129);
        Phone p5 = new Phone("大狼",4999);
        //2
        ArrayList<Phone> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        //3验证
        ArrayList<Phone> result = min3000Return(list);
        System.out.println(result);
    }

    public static ArrayList<Phone> min3000Return(ArrayList<Phone> list){
        ArrayList<Phone> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice()<3000) {
                result.add(list.get(i));
            }
        }
        return result;
    }
}
