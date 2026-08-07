package DecoratorDesignPattern;

public class NutsScoop implements IceCreamConeConstituents {

    private IceCreamConeConstituents iceCream;

    public NutsScoop(IceCreamConeConstituents iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 60;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Nuts Scoop";
    }
    
}
