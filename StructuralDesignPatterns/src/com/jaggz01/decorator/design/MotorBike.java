package com.jaggz01.decorator.design;

public class MotorBike implements Vehicle{


    @Override
    public String typeName() {
        return "MotorBike";
    }

    @Override
    public void print() {
        System.out.println("Type = " + typeName());
    }
}
