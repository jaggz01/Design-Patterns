package com.jaggz01.factorydesign;

public class HouseMain {

    public static void main(String[] args) {
        House h = HouseFactoryBuilder.getHouse(2);
        System.out.println(h.getName());

        h = HouseFactoryBuilder.getHouse(3);
        System.out.println(h.getName());

        h = HouseFactoryBuilder.getHouse(4);
        System.out.println(h.getName());

        h = HouseFactoryBuilder.getHouse(5);
        System.out.println(h.getName());

        h = HouseFactoryBuilder.getHouse(6);
        System.out.println(h.getName());
    }
}
