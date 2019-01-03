package com.example.observer;

public class Main {
    public static void main(String[] args) {
        ISubscriber user = new User("lisan");
        ISubscriber user1 = new User("zhangsan");
        ISubscriber user2 = new User("wangwu");
        IPublish publish = new PublishSubject();
        publish.addSubObserver(user);
        publish.addSubObserver(user1);
        publish.addSubObserver(user2);
        publish.notifySubObserver("祖国海峡两岸必须统一");
    }
}
