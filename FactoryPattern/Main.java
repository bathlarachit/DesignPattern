package FactoryPattern;



public class Main {

     public static void main(String[] args) {
        Client client = new Client();
        
        VehicleFactory vehicleFactory = new BikeFactory();

        client.setVehicle(vehicleFactory);


        System.out.println(String.format("Type: %s, wheels: %s", client.getDescrption(),client.getWheel()));

        vehicleFactory = new CarFactory();

        client.setVehicle(vehicleFactory);

        System.out.println(String.format("Type: %s, wheels: %s", client.getDescrption(),client.getWheel()));


     }
}