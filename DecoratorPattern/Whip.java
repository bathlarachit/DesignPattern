package DecoratorPattern;

public class Whip extends ConcreteDecorator {

    private final String WHIP = "Whip";
    private final int cost = 50;
    private Breverage breverage;

    public Whip(Breverage breverage) {
        this.breverage = breverage;
    }

    @Override
    String getDiscription() {
       return this.breverage.getDiscription()+", "+ this.WHIP;
    }

    @Override
    int getCost() {
      return breverage.getCost() + this.cost;
    }
    
}
