package com.example.observer;

public interface IPublish {
    void addSubObserver(ISubscriber subscriber);
    void deleteSubObserver(ISubscriber subscriber);
    void notifySubObserver(String notifyMsg);
}
