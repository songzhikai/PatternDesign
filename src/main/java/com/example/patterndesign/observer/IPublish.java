package com.example.patterndesign.observer;

public interface IPublish {
    void addObserver(ISubscriber subscriber);
    void deleteObserver(ISubscriber subscriber);
    void notifyObserver(String notifyMsg);
}
