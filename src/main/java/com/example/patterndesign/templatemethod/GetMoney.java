package com.example.patterndesign.templatemethod;

public class GetMoney extends AbsGetMoneyFromBank {

    @Override
    public void doTask() {
        System.out.println("我来取钱");
    }
    @Override
    public void evaluate() {
        System.out.println("给个差评");
    }


}
