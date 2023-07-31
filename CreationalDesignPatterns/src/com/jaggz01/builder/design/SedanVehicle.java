package com.jaggz01.builder.design;

public class SedanVehicle implements Vehicle{


    @Override
    public String typeOfVehicle() {
        return "Sedan";
    }

    @Override
    public Seat typeOfSeat() {
        return new FabricSeat();
    }

    @Override
    public Engine typeOfEngine() {
        return new PetrolEngine();
    }

    @Override
    public MusicSystem typeOfMusicSystem() {
        return new AppleMusicSystem();
    }
}
