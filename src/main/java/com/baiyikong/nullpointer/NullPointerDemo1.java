package com.baiyikong.nullpointer;

import java.util.ArrayList;
import java.util.List;

public class NullPointerDemo1 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        System.out.println(l.size());

    }
}
