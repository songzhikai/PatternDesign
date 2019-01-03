package com.example.templatemethod;

public abstract class GetMoneyFromBank {
    public final void num(){
        System.out.println("取号");
    }
    public abstract void doTask();

    public void evaluate(){
        System.out.println("给个好评价");
    }
    public final void process(){
        num();
        doTask();
        evaluate();
    }
}
