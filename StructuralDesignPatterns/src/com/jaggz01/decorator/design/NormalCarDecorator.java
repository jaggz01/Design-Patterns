package com.jaggz01.decorator.design;

public class NormalCarDecorator extends VehicleDecorator{
    Vehicle v;
    public NormalCarDecorator(Vehicle v) {
        super(v);
        this.v = v;
    }

    @Override
    public String typeName() {
        return super.typeName();
    }

    @Override
    public void print() {
       v.print();
       System.out.println(" Cooler = AC");
    }
}
