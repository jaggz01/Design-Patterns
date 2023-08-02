package com.jaggz01.decorator.design;

public class DecoratorMain {

    public static void main(String[] args) {

        Vehicle v = new VehicleDecorator(new Truck());
        v.print();

        v = new VehicleDecorator(new Car());
        v.print();

        v = new NormalCarDecorator(new Car());
        v.print();

        v = new PremiumCarDecorator(new NormalCarDecorator(new Car()));
        v.print();

    }
}
