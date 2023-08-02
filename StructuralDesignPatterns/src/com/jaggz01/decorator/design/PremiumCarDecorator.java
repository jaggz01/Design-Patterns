package com.jaggz01.decorator.design;

public class PremiumCarDecorator extends NormalCarDecorator{

    Vehicle v;

    public PremiumCarDecorator(Vehicle v) {
        super(v);
        this.v = v;
    }

    public String seatType() {
        return "Leather Seats";
    }

    public String musicSystem() {
        return "Android/Apple play Music System";
    }

    public void print() {
        v.print();
        System.out.println(" seatType = " + seatType() + "\n MusicSystem = " + musicSystem());
    }
}
