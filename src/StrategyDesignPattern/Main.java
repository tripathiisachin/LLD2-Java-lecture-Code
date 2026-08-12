package StrategyDesignPattern;
// Entry point - demonstrates the Strategy Pattern in action.
public class Main {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();

        System.out.println(googleMaps.findPath("Pune", "Mumbai", Mode.CAR));
        System.out.println(googleMaps.findPath("Pune", "Mumbai", Mode.BIKE));
        System.out.println(googleMaps.findPath("Pune", "Mumbai", Mode.WALK));
        System.out.println(googleMaps.findPath("Pune", "Mumbai", Mode.FLIGHT));

        // Adding a new mode tomorrow (e.g. FLIGHT) only needs:
        // 1. A new FlightPathCalculator class implementing PathCalculator
        // 2. One new line inside PathCalculatorFactory
        // -> GoogleMaps.java and Main.java remain UNTOUCHED (OCP satisfied)
    }
}