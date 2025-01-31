package question2;


public class DistanceConverter {
    public static double meterToKm(double distance) {
        return distance / 1000.0;
    }

    public static double kmToMeter(double distance) {
        return distance * 1000.0;
    }

    public static double milesToKm(double distance) {
        return distance * 1.60934;
    }

    public static double kmToMiles(double distance) {
        return distance / 1.60934;
    }
}