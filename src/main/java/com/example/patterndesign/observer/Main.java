package com.example.patterndesign.observer;

public class Main {
    public static void main(String[] args) {
        ISubscriber user = new User("lisan");
        ISubscriber user1 = new User("zhangsan");
        ISubscriber user2 = new User("wangwu");
        IPublish publish = new PublishSubject();
        publish.addObserver(user);
        publish.addObserver(user1);
        publish.addObserver(user2);
        publish.notifyObserver("祖国海峡两岸必须统一");
    }
}
