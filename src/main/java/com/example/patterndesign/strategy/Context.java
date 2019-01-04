package com.example.patterndesign.strategy;

public class Context {
    private IStrategy iStrategy;
    public Context(IStrategy iStrategy){
        this.iStrategy = iStrategy;
    }
    public void encrypt(){
        this.iStrategy.encrypt();
    }
}
