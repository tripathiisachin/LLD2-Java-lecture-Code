package StrategyDesignPattern;

// Concrete Strategy #2 - handles path calculation logic ONLY for BIKE mode.
public class BikePathCalculator implements PathCalculator {

    @Override
    public String findPath(String src, String dest) {
        // In real life: bike-lane specific routing logic
        return "[BIKE] Bike-lane route from " + src + " to " + dest ;
    }
}