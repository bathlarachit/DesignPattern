package AbstractFactory;

public class ToyotaSuv implements Vehicle{


    final int price = 27;
    final String BRAND;
    final String description ="7 Seater SUV";
    final String fuelType;

    public ToyotaSuv(String bRAND, String fuelType) {
        BRAND = bRAND;
        this.fuelType = fuelType;
        System.out.println("Creating Toyota suv ......");
    }

   

    @Override
    public String getBrand() {
        return this.BRAND;
    }

    @Override
    public String getDescryption() {
        return this.description;
    }

    @Override
    public String getPrice() {
      return String.valueOf(price);
    }

    @Override
    public String getFuelType() {
      return this.fuelType;
    }
}
