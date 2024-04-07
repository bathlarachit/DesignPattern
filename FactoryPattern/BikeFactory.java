package FactoryPattern;

public class BikeFactory implements VehicleFactory{

   final String  type = "Bike";
   final int wheelCount=2;

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getWheelCount() {
       return wheelCount;
    }

    @Override
    public Vehicle creatVehicle() {
       return new Bike(type,wheelCount);
    }
    
}
