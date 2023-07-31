package com.jaggz01.builder.design;

public class PetrolEngine implements Engine{

    @Override
    public String typeOfEngine() {
        return "Petrol";
    }

    @Override
    public String powerOfEngine() {
        return "High";
    }
}
