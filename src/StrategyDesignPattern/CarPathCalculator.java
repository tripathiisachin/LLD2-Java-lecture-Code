package StrategyDesignPattern;

// Concrete Strategy #1 - handles path calculation logic ONLY for CAR mode.
public class CarPathCalculator implements PathCalculator {

    @Override
    public String findPath(String src, String dest) {
        // In real life: car-specific routing logic (highways, traffic, tolls, etc.)
        return "[CAR] Fastest road route from " + src + " to " + dest ;
    }
}