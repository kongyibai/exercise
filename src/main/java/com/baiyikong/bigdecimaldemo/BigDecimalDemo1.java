package com.baiyikong.bigdecimaldemo;

import java.math.BigDecimal;
import java.util.ArrayList;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("1");
        ArrayList<BigDecimal> arr = new ArrayList<>();
        arr.add(new BigDecimal("3"));
        arr.add(new BigDecimal("3"));
        arr.add(new BigDecimal("3"));
        arr.add(new BigDecimal("3"));
        for (BigDecimal bigDecimal : arr) {
            bigDecimal = bigDecimal.add(new BigDecimal("3"));
        }

        for (BigDecimal bigDecimal : arr) {
            System.out.println(bigDecimal);
        }
        b1.add(null);
        System.out.println(b1);
    }
}
