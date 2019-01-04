package com.example.patterndesign.strategy;

public class SHA1Encrypt implements IStrategy {
    @Override
    public void encrypt() {
        System.out.println("sha1 encrypt");
    }
}
