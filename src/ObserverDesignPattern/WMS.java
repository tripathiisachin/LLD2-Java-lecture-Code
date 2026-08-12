package ObserverDesignPattern;

public class WMS implements OrderPlacedSubscriber {

    @Override
    public void onOrderPlaced() {
        System.out.println("Updating inventory in WMS...");
    }   
    
}
