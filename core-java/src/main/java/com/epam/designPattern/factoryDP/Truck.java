package com.epam.designPattern.factoryDP;

public class Truck implements VehicleManager{
    @Override
    public void run() {
        System.out.println("Truck is running");
    }
}
