package com.jaggz01.builder.design;

public class DieselEngine implements Engine{


    @Override
    public String typeOfEngine() {
        return "Diesel";
    }

    @Override
    public String powerOfEngine() {
        return "Medium";
    }
}
