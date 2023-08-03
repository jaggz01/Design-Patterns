package com.jaggz01.proxy.design;

public class RealInternet implements Internet{


    @Override
    public void connectToInternet(String address) {
        System.out.println("Connected to internet = " + address);
    }
}
