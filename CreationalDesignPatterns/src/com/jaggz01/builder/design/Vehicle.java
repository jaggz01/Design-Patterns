package com.jaggz01.builder.design;

public interface Vehicle {

    String typeOfVehicle();
    Seat typeOfSeat();
    Engine typeOfEngine();
    MusicSystem typeOfMusicSystem();

    default void printSystem() {
        System.out.println("Vehicle type = " + typeOfVehicle() + "\n seat type = " + typeOfSeat().seatType() + "\n engine type = "
                + typeOfEngine().typeOfEngine() + "\n power is = " + typeOfEngine().powerOfEngine() + "\n music system type = "
                + typeOfMusicSystem().typeMusicSystem());
    }

}
