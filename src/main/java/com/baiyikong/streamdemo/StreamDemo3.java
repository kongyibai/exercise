package com.baiyikong.streamdemo;

import java.util.ArrayList;

public class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(6);
        arr.add(89);
        arr.add(14);
        arr.add(16);
        arr.add(18);
        arr.add(19);

        arr.stream().filter(i -> i<=5 || i>=15).limit(3).filter(i -> i>=0).forEach(System.out::println);

    }
}
