package FactoryPattern;

public interface VehicleFactory {

    String getType();
    int getWheelCount();

    Vehicle creatVehicle();
    
} 
