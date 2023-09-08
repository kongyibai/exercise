package com.baiyikong.threaddemo;

public class ThreadDemo3 {
    public static void main(String[] args) {
        //练习一下使用多线程的同步问题
        SellTicket sellTicket = new SellTicket();
        Thread thread1 = new Thread(sellTicket,"售票口A");
        Thread thread2 = new Thread(sellTicket,"售票口B");
        Thread thread3 = new Thread(sellTicket,"售票口C");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
