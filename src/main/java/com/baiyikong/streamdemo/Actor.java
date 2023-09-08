package com.baiyikong.streamdemo;

import lombok.Data;

@Data
public class Actor {
    private String name;

    public Actor(){
        name = "";
    }

    public Actor(String name){
        this.name = name;
    }

}
