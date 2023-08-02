package com.jaggz01.decorator.design;

public class Car implements  Vehicle{

    @Override
    public String typeName() {
        return "Car";
    }

    @Override
    public void print() {
        System.out.println("Type = " + typeName());
    }
}
