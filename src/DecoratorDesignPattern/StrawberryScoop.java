package DecoratorDesignPattern;

public class StrawberryScoop implements IceCreamConeConstituents {

    private IceCreamConeConstituents iceCream;

    public StrawberryScoop(IceCreamConeConstituents iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 18;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Strawberry Scoop";
    }
}
