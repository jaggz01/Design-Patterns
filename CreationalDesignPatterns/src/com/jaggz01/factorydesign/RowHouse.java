package com.jaggz01.factorydesign;

public class RowHouse implements House{
    @Override
    public int roomNumber() {
        return 4;
    }

    @Override
    public String getName() {
        return "RowHouse";
    }
}
