package com.jaggz01.factorydesign;

public class Condo implements House{
    @Override
    public int roomNumber() {
        return 3;
    }

    @Override
    public String getName() {
        return "Condo";
    }
}
