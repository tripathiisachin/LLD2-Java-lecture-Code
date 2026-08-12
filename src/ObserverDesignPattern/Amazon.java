package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Amazon {

    private List<OrderPlacedSubscriber> subscribers =
            new ArrayList<>();

    public void register(OrderPlacedSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void deregister(OrderPlacedSubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void orderPlaced() {

        System.out.println("Order Placed");

        for (OrderPlacedSubscriber subscriber : subscribers) {
            subscriber.onOrderPlaced();
        }
    }
}
