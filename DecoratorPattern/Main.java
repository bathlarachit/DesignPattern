package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        Breverage breverage = new Expreso();
        System.out.println(String.format("Item: %s, cost: %d",breverage.getDiscription(), breverage.getCost()));
        breverage = new Mocha(breverage);
        System.out.println(String.format("Item: %s, cost: %d",breverage.getDiscription(), breverage.getCost()));
        breverage = new Whip(breverage);

        System.out.println(String.format("Description: %s",breverage.getDiscription()));
        System.out.println(String.format("Cost: %d", breverage.getCost()));

    }
}
