package com.baiyikong.threaddemo;

public class TestThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("小蚊子" + i);
        }
    }
}
