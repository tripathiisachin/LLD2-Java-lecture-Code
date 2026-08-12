package StrategyDesignPattern;

// Factory Design Pattern used ALONGSIDE Strategy Pattern.
// Its only job: given a "mode", return the correct strategy object.
// Notice: the if-else here is ONLY for object creation, not for actual logic.
public class PathCalculatorFactory {

    public PathCalculator getPathCalculator(Mode mode) {
        if (mode == Mode.CAR) {
            return new CarPathCalculator();
        } else if (mode == Mode.BIKE) {
            return new BikePathCalculator();
        } else if (mode == Mode.WALK) {
            return new WalkPathCalculator();
        }
        else if (mode == Mode.FLIGHT) {
            return new FlightPathCalculator();
        }
        throw new IllegalArgumentException("Unsupported mode: " + mode);
    }
}