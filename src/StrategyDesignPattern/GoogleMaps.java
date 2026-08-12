package StrategyDesignPattern;

// This is the "client" class - it does NOT know HOW each mode calculates
// its path. It just asks the factory for the right strategy and uses it.
// This keeps GoogleMaps clean, SRP-compliant, and OCP-compliant.
public class GoogleMaps {

    private final PathCalculatorFactory factory = new PathCalculatorFactory();

    public String findPath(String src, String dest, Mode mode) {
        PathCalculator pathCalculator = factory.getPathCalculator(mode);
        return pathCalculator.findPath(src, dest);
    }
}
