package com.baiyikong.threaddemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SellTicket implements Runnable{
    private Integer keepTicketNum = 100;
    private Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            //任意对象就可以看成是一把锁
            synchronized (obj) { // 对可能有安全问题的代码加锁,多个线程必须使用同一把锁
                //t1进来后，就会把这段代码给锁起来
                if (keepTicketNum > 0) {
                    try {
                        //t1休息100毫秒
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //窗口1正在出售第100张票
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + keepTicketNum + "张票");
                    keepTicketNum--; //tickets = 99;
                }
            }
            //t1出来了，这段代码的锁就被释放了
        }
    }
}
