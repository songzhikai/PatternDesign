package com.example.patterndesign.strategy;

public class Main {
    public static void main(String[] args) {
        Md5Encrypt md5Encrypt = new Md5Encrypt();
        SHA1Encrypt sha1Encrypt = new SHA1Encrypt();
        Context context = new Context(md5Encrypt);
        context.encrypt();
        Context context2 = new Context(sha1Encrypt);
        context2.encrypt();
    }
}
