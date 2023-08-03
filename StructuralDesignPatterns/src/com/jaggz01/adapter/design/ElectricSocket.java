package com.jaggz01.adapter.design;

public class ElectricSocket implements IElectricSocket{
    @Override
    public void sendCurent() {
        System.out.println("Sending Current");
    }
}
