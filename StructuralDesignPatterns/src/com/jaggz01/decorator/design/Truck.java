package com.jaggz01.decorator.design;

public class Truck implements Vehicle{

    @Override
    public String typeName() {
        return "Truck";
    }


    public String engineCapacity() {
        return "heavy";
    }

    @Override
    public void print() {
        System.out.println("Type = " + typeName() + "\n Engine = " + engineCapacity());
    }
}
