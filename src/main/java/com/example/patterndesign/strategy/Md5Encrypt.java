package com.example.patterndesign.strategy;

public class Md5Encrypt implements IStrategy{
    @Override
    public void encrypt() {
        System.out.println("md5 encrypt");
    }
}
