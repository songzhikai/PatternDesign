package com.example.patterndesign.singleinstance;

/**
 * 静态内部类
 */
public class StaticInnerClass {
    private static class SingletonHolder{
        public static StaticInnerClass staticInnerClass = new StaticInnerClass();
    }
    public static StaticInnerClass getInstance(){
        return SingletonHolder.staticInnerClass;
    }
}
