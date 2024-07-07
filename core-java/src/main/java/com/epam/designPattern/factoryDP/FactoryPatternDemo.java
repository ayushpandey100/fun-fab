package com.epam.designPattern.factoryDP;

public class FactoryPatternDemo {
    static VehicleManager vehicleManager;
    public static void main(String[] args) {

        vehicleManager =VehicleFactory.getVehicle("car");
        vehicleManager.run();
    }
}
