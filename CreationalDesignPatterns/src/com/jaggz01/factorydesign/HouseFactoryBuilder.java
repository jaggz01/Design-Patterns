package com.jaggz01.factorydesign;

public class HouseFactoryBuilder {

    public static House getHouse(int roomNumbers) {
        switch (roomNumbers) {
            case 2 : return new Apartment();
            case 3 : return new Condo();
            case 4 : return new RowHouse();
            case 5:  return new Bunglow();
        }
        return null;
    }
}
