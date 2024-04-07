package FactoryPattern;

public class CarFactory implements VehicleFactory {

    final int wheelCount;
    final String descString;

    public CarFactory(){
        wheelCount =4;
        descString = "Car....";
    }

    @Override
    public String getType() {
       return descString;
    }

    @Override
    public int getWheelCount() {
        return wheelCount;
    }

    @Override
    public Vehicle creatVehicle() {
       return new Car(descString, wheelCount);
    }
    
}
