package com.jaggz01.observer.design;

public class ObserverMain {

    public static void main(String[] args) {

        IPhoneSubject subject = new IPhoneSubject();

        new IPhoneSubsClient(subject);
        subject.setValue("Iphone subscribed");

        subject.setValue("Motorola subscribed");
    }
}
