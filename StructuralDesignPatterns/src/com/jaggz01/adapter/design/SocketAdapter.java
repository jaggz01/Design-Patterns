package com.jaggz01.adapter.design;

public class SocketAdapter implements IElectricSocket{

    ICharger charger;
    public SocketAdapter(ICharger charger) {
        this.charger = charger;
    }


    @Override
    public void sendCurent() {
        charger.chargePhone();
    }
}
