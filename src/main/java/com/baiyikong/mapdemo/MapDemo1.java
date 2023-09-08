package com.baiyikong.mapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        //首先复习一下数组、单列集合、双列集合的增删改查、遍历等基本操作
        String[] arrs = new String[9];
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = "asd";
        }

//        for (String arr : arrs) {
//            System.out.println(arr);
//        }

        //set练习
/*        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(21);
        hashSet.add(14);
        hashSet.add(234);
        hashSet.add(11);
        System.out.println(hashSet);
        hashSet.remove(21);
        System.out.println(hashSet);
        hashSet.add(21);
        boolean flag = hashSet.contains(21);
        System.out.println(flag);*/


        //map练习
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"小乐乐");
        hm.put(2,"小璐璐");
        hm.put(3,"小慧慧");
//        System.out.println(hm);
//        System.out.println(hm.get(1));
        //map集合的三种遍历方式
        //第一种是将键提取出来，然后根据键去遍历
        Set<Integer> hmKeys = hm.keySet();
//        Collection<String> hmValues = hm.values();
//        System.out.println(hmKeys);
//        System.out.println(hmValues);
        /*for (Integer hmKey : hmKeys) {
            System.out.println(hm.get(hmKey));
        }*/

        //迭代器遍历一下key集合
/*        Iterator<Integer> it = hmKeys.iterator();
        while (it.hasNext()){
            System.out.println(hm.get(it.next()));
        }*/

        //lambda表达式来遍历一下key集合，本质上是简化函数式接口
        hmKeys.forEach(integer -> System.out.println(hm.get(integer)));
        //第二种是根据键值对来进行遍历  entry
        Set<Map.Entry<Integer, String>> hmEntry = hm.entrySet();
        for (Map.Entry<Integer, String> hmEn : hmEntry) {
            System.out.println(hmEn);
        }

        //文件，IO，网络编程相关

    }
}
