package AbstractFactory;

public class ToyotaFactory implements VehicleFactory{

    @Override
    public Vehicle creatVehicle(String type) {
        System.out.println("Creating new Toyota Vehicle.....");
        if(type.equals(VehicleType.SUV.toString())) return new ToyotaSuv("Toyota","Petrol");
        else return new ToyotaEv("Toyota","EV");
    }
    
    
}
