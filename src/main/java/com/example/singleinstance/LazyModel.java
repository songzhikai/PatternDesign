package com.example.singleinstance;

public class LazyModel {
    private String name;
    private static LazyModel lazyModel;
    private LazyModel(String name){
        this.name = name;
    }

    public static LazyModel getInstance(){
        if(lazyModel == null ){
            lazyModel = new LazyModel("zhangsan");
        }
        return lazyModel;
    }

    public static void main(String[] args) {
        LazyModel.getInstance();
    }
}
