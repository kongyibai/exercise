package com.baiyikong.threaddemo;

public class TheadDemo2 {
    public static void main(String[] args) {

        //练习一下线程的优先级设置方式
        //Java使用的是抢占式调度模型

        //实现  如何各不同的线程设置不同的优先级
        TestThread1 thread1 = new TestThread1();

        TestRunnable1 testRunnable1 = new TestRunnable1();
        Thread thread2 = new Thread(testRunnable1);

        thread1.setPriority(10);
        thread2.setPriority(1);
        thread2.setDaemon(true);

        thread1.start();
        thread2.start();

    }
}
