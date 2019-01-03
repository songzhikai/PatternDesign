package com.example.patterndesign.factory;

public class BenzFactoryC100 implements IBenzFactory{

    @Override
    public IBenz createBenz() {
        return new BenzC100();
    }
}
