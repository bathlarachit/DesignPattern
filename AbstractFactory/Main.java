package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new HyundaiFactory();

        Vehicle vehicle = vehicleFactory.creatVehicle(VehicleType.EV.toString());

        System.out.println(String.format("Brand: %s, Price: %s, Fuel %s, Description: %s", vehicle.getBrand(), vehicle.getPrice(),vehicle.getFuelType(),vehicle.getDescryption()));
        
        vehicle = vehicleFactory.creatVehicle(VehicleType.SUV.toString());

        System.out.println(String.format("Brand: %s, Price: %s, Fuel %s, Description: %s", vehicle.getBrand(), vehicle.getPrice(),vehicle.getFuelType(),vehicle.getDescryption()));
     

        vehicleFactory = new ToyotaFactory();

        vehicle = vehicleFactory.creatVehicle(VehicleType.SUV.toString());

        System.out.println(String.format("Brand: %s, Price: %s, Fuel %s, Description: %s", vehicle.getBrand(), vehicle.getPrice(),vehicle.getFuelType(),vehicle.getDescryption()));
     
        vehicle = vehicleFactory.creatVehicle(VehicleType.EV.toString());

        System.out.println(String.format("Brand: %s, Price: %s, Fuel %s, Description: %s", vehicle.getBrand(), vehicle.getPrice(),vehicle.getFuelType(),vehicle.getDescryption()));
     


    }
}
 enum VehicleType{
    SUV,
    EV;
}