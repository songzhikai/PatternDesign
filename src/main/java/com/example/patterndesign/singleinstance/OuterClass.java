package com.example.patterndesign.singleinstance;

/**
 * 静态内部类
 */
public class OuterClass {
    private String name;
    private OuterClass(String name){
        this.name = name;
    }
    private static class StaticInnerClass{
        public static OuterClass instance = new OuterClass("zhangsan");
    }
    public static OuterClass getInstance(){
        return StaticInnerClass.instance;
    }

    public static void main(String[] args) {
        OuterClass instance = OuterClass.getInstance();
        System.out.println(instance.name);

    }
}
