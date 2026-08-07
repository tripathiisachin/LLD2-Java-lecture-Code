package DecoratorDesignPattern;
public class Client {

    public static void main(String[] args) {

        IceCreamConeConstituents iceCream = new OrangeCone();

        iceCream = new VanillaScoop(iceCream);

        iceCream = new StrawberryScoop(iceCream);

        iceCream = new ChocoChips(iceCream);
        iceCream = new NutsScoop(iceCream);

        System.out.println("Cost : " + iceCream.getCost());

        System.out.println("Description : " + iceCream.getDescription());
    }
}
