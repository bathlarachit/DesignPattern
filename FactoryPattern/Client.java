package FactoryPattern;

public class Client {
   
    private Vehicle vehicle;

    

    public void setVehicle(VehicleFactory vehicleFactory) {
        this.vehicle = vehicleFactory.creatVehicle();
    }

    public String getDescrption(){
        return vehicle.getDescription();
    }

    public String getWheel(){
        return vehicle.getType();
    }

    
}
