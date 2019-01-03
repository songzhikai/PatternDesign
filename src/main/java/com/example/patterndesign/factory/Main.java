package com.example.patterndesign.factory;

public class Main {
    public static void main(String[] args) {
        IBenzFactory factory = new BenzFactoryC100();
        factory.createBenz();
    }
}
