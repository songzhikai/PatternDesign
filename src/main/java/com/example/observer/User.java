package com.example.observer;

public class User implements ISubscriber{

    private String name;
    public User(String name){
        this.name = name;
    }
    @Override
    public void update(String msg) {
        System.out.println(this.name+"收到的信息是：" + msg);
    }
}
