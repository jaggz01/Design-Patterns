package com.jaggz01.proxy.design;

public class ProxyDesignMain {

    public static void main(String[] args) {
        Internet internet = new ProxyRealInternet();
        internet.connectToInternet("google.com");

        internet.connectToInternet("abc.com");
    }
}
