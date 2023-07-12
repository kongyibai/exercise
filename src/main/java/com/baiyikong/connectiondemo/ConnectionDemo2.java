package com.baiyikong.connectiondemo;

import java.util.ArrayList;

public class ConnectionDemo2 {
    public static void main(String[] args) {
        //创建三个对象
        User user1 = new User(1,"小诗诗","123456");
        User user2 = new User(2,"小老虎","1234567");
        User user3 = new User(3,"小羊","123456789");
        
        //创造一个集合来存储对象
        ArrayList<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        //验证一下
        System.out.println(getById(list,4));
        
    }
    
    public static boolean getById(ArrayList<User> list,int id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id){
                return true;
            }
        }
        return false;
    }
}
