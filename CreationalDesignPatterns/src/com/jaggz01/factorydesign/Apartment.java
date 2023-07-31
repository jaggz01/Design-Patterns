package com.jaggz01.factorydesign;

public class Apartment implements House{

    @Override
    public int roomNumber() {
        return 2;
    }

    @Override
    public String getName() {
        return "Apartment";
    }
}
