package StrategyDesignPattern;

public class FlightPathCalculator implements PathCalculator {

    @Override
    public String findPath(String src, String dest) {
        // In real life: flight-specific routing logic (airports, flight paths, etc.)
        return "[FLIGHT] Air route from " + src + " to " + dest ;
    }
    
}
