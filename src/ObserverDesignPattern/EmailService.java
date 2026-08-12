package ObserverDesignPattern;

public class EmailService  implements OrderPlacedSubscriber {

    @Override
    public void onOrderPlaced() {
        System.out.println("Sending order confirmation email...");
    }   
    
}
