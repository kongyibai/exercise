package com.baiyikong.threaddemo;

public class TestRunnable1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("数第" + i + "只🐏");
        }
    }
}
