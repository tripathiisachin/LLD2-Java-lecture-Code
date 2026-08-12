package StrategyDesignPattern;

// Common interface (Strategy) that every "mode of transport" must implement.
// This is the contract - it says "whoever implements me MUST provide findPath()"
public interface PathCalculator {
    String findPath(String src, String dest);
}