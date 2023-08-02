package com.jaggz01.observer.design;

public abstract class Observer {
    protected IPhoneSubject subject;
    public abstract void update();
}
