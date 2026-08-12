package ObserverDesignPattern;

public class InvoiceGenerator  implements OrderPlacedSubscriber {

    @Override
    public void onOrderPlaced() {
        System.out.println("Generating invoice for the order...");
    }
    
}
