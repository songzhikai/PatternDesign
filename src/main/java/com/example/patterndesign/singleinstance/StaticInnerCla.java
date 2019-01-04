package com.example.patterndesign.singleinstance;

/**
 * 静态内部类
 */
public class StaticInnerCla {
    private static class SingletonHolder{
        public static StaticInnerCla staticInnerCla = new StaticInnerCla();
    }
    public static StaticInnerCla getInstance(){
        return SingletonHolder.staticInnerCla;
    }
}
