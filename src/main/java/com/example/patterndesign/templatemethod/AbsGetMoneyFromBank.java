package com.example.patterndesign.templatemethod;

public abstract class AbsGetMoneyFromBank {
    protected void num(){
        System.out.println("取号");
    }
    protected abstract void doTask();

    protected void evaluate(){
        System.out.println("给个好评价");
    }
    protected final void process(){
        this.num();
        this.doTask();
        this.evaluate();
    }
}
