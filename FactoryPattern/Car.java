package FactoryPattern;

public class Car implements Vehicle {

   final String description;
   public Car(String description, int wheelCount) {
    this.description = description;
    this.wheelCount = wheelCount;
}

final int wheelCount;

    @Override
    public String getDescription() {
      return this.description;
    }

    @Override
    public String getType() {
      return String.valueOf(wheelCount);
    }
    
}
