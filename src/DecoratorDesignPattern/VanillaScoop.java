package DecoratorDesignPattern;

public class VanillaScoop implements IceCreamConeConstituents {

    private IceCreamConeConstituents iceCream;

    public VanillaScoop(IceCreamConeConstituents iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 15;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Vanilla Scoop";
    }
}