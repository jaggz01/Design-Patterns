package com.jaggz01.decorator.design;

public class VehicleDecorator implements Vehicle{

    Vehicle v;
    public VehicleDecorator(Vehicle v) {
        this.v = v;
    }
    @Override
    public String typeName() {
        return v.typeName();
    }

    public void print() {
        v.print();
    }
}
