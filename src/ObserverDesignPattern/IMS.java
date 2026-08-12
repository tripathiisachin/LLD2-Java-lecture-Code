package ObserverDesignPattern;

public class IMS implements OrderPlacedSubscriber {

    @Override
    public void onOrderPlaced() {
        System.out.println("Updating inventory in IMS...");
    }
    
}
