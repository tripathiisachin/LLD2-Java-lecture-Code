package StrategyDesignPattern;

// Concrete Strategy #3 - handles path calculation logic ONLY for WALK mode.
public class WalkPathCalculator implements PathCalculator {

    @Override
    public String findPath(String src, String dest) {
        // In real life: pedestrian-only paths, footbridges, etc.
        return "[WALK] Pedestrian route from " + src + " to " + dest ;
    }
}