package com.jaggz01.builder.design;

public class SUVVehicle implements Vehicle {
    @Override
    public String typeOfVehicle() {
        return "SUV";
    }

    @Override
    public Seat typeOfSeat() {
        return new LeatherSeat();
    }

    @Override
    public Engine typeOfEngine() {
        return new DieselEngine();
    }

    @Override
    public MusicSystem typeOfMusicSystem() {
        return new AndroidMusicSystem();
    }
}
