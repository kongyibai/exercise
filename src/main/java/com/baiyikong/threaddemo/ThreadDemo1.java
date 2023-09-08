package com.baiyikong.threaddemo;

public class ThreadDemo1 {
    public static void main(String[] args) {
        //实现一下我们的多线程

        //实现方式一，继承thread类
        TestThread1 thread1 = new TestThread1();
        thread1.start();

        //实现方式二,实现Runnable接口
        TestRunnable1 runnable1 = new TestRunnable1();
        //注意这里的Thread类可以直接使用官方的而不用再使用自定义的
        Thread thread2 = new Thread(runnable1);
        thread2.start();
    }
}
