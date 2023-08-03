package com.jaggz01.adapter.design;

public class AdapterMain {

    public static void main(String[] args) {

        ICharger charger = new PhoneCharger();
        SocketAdapter adapter = new SocketAdapter(charger);
        adapter.sendCurent();
    }
}
