package com.epam.designPattern.factoryDP;

public class VehicleFactory {

    public static VehicleManager getVehicle(String vehicle){
        VehicleManager vehicleManager=null;
        if(vehicle=="bike"){
            vehicleManager=new Bike();

        }
            else if(vehicle=="car"){
                vehicleManager=new Car();

        }
                else{
                vehicleManager=new Truck();
        }
        return vehicleManager;
    }
}
