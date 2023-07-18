package com.baiyikong.streamdemo;

import java.util.Arrays;

public class StreamDemo1 {
    public static void main(String[] args) {
//        //单列集合可以直接使用stream流
//        ArrayList<String> arr = new ArrayList<>();
//        Collections.addAll(arr,"a","b","c");
//
//        arr.stream().forEach(s -> System.out.println(s));
//
//        //双列集合stream流
//        HashMap<String,Integer> hm = new HashMap<>();
//        hm.put("aaa",1);
//        hm.put("bbb",2);
//        hm.put("ccc",3);
//        hm.put("ddd",1);
//        System.out.println(hm);
//        hm.keySet().stream().forEach(s -> System.out.println(s));
//        hm.entrySet().stream().forEach(entry -> System.out.println(entry));


        //注意工具类的使用，arrays类,和我们的collections类
        String[] str = {"1","2","12"};
        Arrays.stream(str).forEach(s -> System.out.println(s));
    }
}
