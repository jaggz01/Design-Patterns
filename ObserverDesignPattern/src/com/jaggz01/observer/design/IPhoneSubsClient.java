package com.jaggz01.observer.design;

public class IPhoneSubsClient extends Observer{
    Subject s;
    public IPhoneSubsClient(Subject s){
        this.s = s;
        s.attach(this);
    }

    @Override
    public void update() {
        System.out.println(s.getValue());
    }
}
