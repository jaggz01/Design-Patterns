package com.jaggz01.builder.design;

public class VehicleBuilder {

    public static Vehicle createSUVVehicle() {
        return new SUVVehicle();
    }

    public static Vehicle createSedanVehicle() {
        return new SedanVehicle();
    }
}
