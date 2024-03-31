package DecoratorPattern;

public class Mocha extends ConcreteDecorator {

    private final String MOCHA = "Mocha";
    private final int cost = 50;
    private Breverage breverage;

    

    public Mocha(Breverage breverage) {
        this.breverage = breverage;
    }

    @Override
    String getDiscription() {
       return this.breverage.getDiscription()+","+ this.MOCHA;
    }

    @Override
    int getCost() {
      return breverage.getCost()+ this.cost;
    }
    
}
