package AbstractFactory;

public class HyundaiFactory implements VehicleFactory{

    

    @Override
    public Vehicle creatVehicle(final String IsSuv) {
       System.out.println("Creating new Hyundai Vehicle.....");
        if(IsSuv.equals(VehicleType.SUV.toString())) return new HyundaiSuv("Hyundai","Petrol");
        else return new HyundaiEV("Hyundai","EV");
    }
    
}
