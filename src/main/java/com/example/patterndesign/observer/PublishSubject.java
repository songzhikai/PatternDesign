package com.example.patterndesign.observer;

import java.util.ArrayList;
import java.util.List;

public class PublishSubject implements IPublish{
    public List<ISubscriber> list;
    public PublishSubject(){
        list = new ArrayList<ISubscriber>();
    }
    @Override
    public void addSubObserver(ISubscriber subscriber) {
        this.list.add(subscriber);
    }

    @Override
    public void deleteSubObserver(ISubscriber subscriber) {
        this.list.remove(subscriber);
    }

    @Override
    public void notifySubObserver(String notifyMsg) {
        for(ISubscriber subscriber : list){
            subscriber.update(notifyMsg);
        }
    }
}
