package com.baiyikong.connectiondemo;

import java.math.BigDecimal;

public class ConnectionDemo4 {
    public static void main(String[] args) {
        BigDecimal count = BigDecimal.ZERO;
        for (int i = 0; i < 5; i++) {
            count = count.add(new BigDecimal("1"));
        }
        System.out.println(count);
    }


}
