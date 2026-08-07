package DecoratorDesignPattern;

public class ChocoChips implements IceCreamConeConstituents {

    private IceCreamConeConstituents iceCream;

    public ChocoChips(IceCreamConeConstituents iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Choco Chips";
    }
}