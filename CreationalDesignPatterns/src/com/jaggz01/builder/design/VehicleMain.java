package com.jaggz01.builder.design;

public class VehicleMain {

    public static void main(String[] args) {
        Vehicle v  = VehicleBuilder.createSedanVehicle();
        v.printSystem();

        v  = VehicleBuilder.createSUVVehicle();
        v.printSystem();
    }
}
