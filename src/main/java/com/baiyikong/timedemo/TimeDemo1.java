package com.baiyikong.timedemo;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeDemo1 {
    public static void main(String[] args) {
        //练习一下java7和java8的时间日期相关类
        //java7 时间相关类  Date 时间  SimpleDateFormat 格式化时间  Calendar 日历
    /*    Date d1 = new Date(0L);
        long l1 = d1.getTime();
        l1 += 365*24*60*60*1000L;
        System.out.println(l1);

        Date d2 = new Date();
        long l2 = d2.getTime();
        System.out.println(l2);
        System.out.println(l2>l1);
        System.out.println(l2/l1);

        System.out.println(d1);*/

        //日期相关
        Calendar cld = Calendar.getInstance();
        Date d3 = new Date(0L);
        cld.setTime(d3);
        cld.getTime();

        //java8 的时区相关
        System.out.println(ZoneId.systemDefault());

        //java8 的时间相关
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(System.currentTimeMillis());
        System.out.println(new Date().getTime());
        long now = System.currentTimeMillis();
        long zero =  System.currentTimeMillis()- ( System.currentTimeMillis()+ TimeZone.getDefault().getRawOffset()) % (1000 * 3600 * 24);
        System.out.println(zero);
        System.out.println(((14*60)+56)*60*1000);
        System.out.println(now-zero);
        //工具类相关
    }
}
