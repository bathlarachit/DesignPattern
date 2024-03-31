package DecoratorPattern;

public class Expreso extends Breverage{

    private final String EXPRESO = "Expreso";
    private final int cost = 120;
    @Override
    String getDiscription() {
       return this.EXPRESO;
    }

    @Override
    int getCost() {
      return this.cost;
    }
    
}
