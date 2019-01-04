package com.example.patterndesign.singleinstance;

public class HungryModel {
    private static HungryModel instance = new HungryModel();
    public static HungryModel getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        HungryModel.getInstance();
    }
}
