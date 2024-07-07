package com.epam.designPattern.factoryDP;

public class Car implements VehicleManager{
    @Override
    public void run() {
        System.out.println("Car is running");
    }
}
