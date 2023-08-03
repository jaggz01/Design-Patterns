package com.jaggz01.adapter.design;

public class PhoneCharger implements ICharger{

    @Override
    public void chargePhone() {
        System.out.println("Charge Phone from socket");
    }
}
