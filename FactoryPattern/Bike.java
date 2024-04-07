package FactoryPattern;

public class Bike implements Vehicle{

   final String description;
   public Bike(String description, int wheelCount) {
    this.description = description;
    this.wheelCount = wheelCount;
}

final int wheelCount;

    @Override
    public String getDescription() {
       return description;
    }

    @Override
    public String getType() {
       return String.valueOf(wheelCount);
    }
    
}
