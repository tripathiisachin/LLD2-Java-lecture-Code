package DecoratorDesignPattern;

public class ChocolateCone implements IceCreamConeConstituents {

    @Override
    public int getCost() {
        return 25;
    }

    @Override
    public String getDescription() {
        return "Chocolate Cone";
    }
}