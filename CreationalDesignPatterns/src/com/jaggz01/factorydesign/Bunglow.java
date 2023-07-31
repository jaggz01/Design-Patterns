package com.jaggz01.factorydesign;

public class Bunglow implements House{

    @Override
    public int roomNumber() {
        return 5;
    }

    @Override
    public String getName() {
        return "Bunglow";
    }
}
