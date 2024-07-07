package com.epam.designPattern.factoryDP;

public class Bike implements VehicleManager{
    @Override
    public void run() {
        System.out.println("Bike is running");
    }
}
