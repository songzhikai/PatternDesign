package com.example.patterndesign.observer;

import java.util.ArrayList;
import java.util.List;

public class PublishSubject implements IPublish{
    public List<ISubscriber> list;
    public PublishSubject(){
        list = new ArrayList<ISubscriber>();
    }
    @Override
    public void addObserver(ISubscriber subscriber) {
        this.list.add(subscriber);
    }

    @Override
    public void deleteObserver(ISubscriber subscriber) {
        this.list.remove(subscriber);
    }

    @Override
    public void notifyObserver(String notifyMsg) {
        for(ISubscriber subscriber : list){
            subscriber.update(notifyMsg);
        }
    }
}
