package com.example.patterndesign.factory;

public class BenzC100 implements IBenz {

    public BenzC100(){
        this.color();
        this.prize();
    }

    @Override
    public void color() {
        System.out.println("C100 白色");
    }

    @Override
    public void prize() {
        System.out.println("C100 100万");
    }
}
