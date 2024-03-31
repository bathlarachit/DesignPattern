package DecoratorPattern;

public class RoastCoco extends Breverage{

    private final String ROASTCOCO = "RoastCoco";
    private final int cost = 240;

    @Override
    String getDiscription() {
      return this.ROASTCOCO;
    }

    @Override
    int getCost() {
     return this.cost;
    }
    
}
