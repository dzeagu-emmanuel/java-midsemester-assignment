package question2;

public class CurrencyConverter {
    public static double dollarToGh(double amount) {
        return amount * 10.0; // Assuming 1 Dollar = 10 Gh
    }

    public static double ghToDollar(double amount) {
        return amount / 10.0;
    }

    public static double euroToGh(double amount) {
        return amount * 12.0; // Assuming 1 Euro = 12 Gh
    }

    public static double ghToEuro(double amount) {
        return amount / 12.0;
    }

    public static double yenToGh(double amount) {
        return amount * 0.1; // Assuming 1 Yen = 0.1 Gh
    }

    public static double ghToYen(double amount) {
        return amount / 0.1;
    }
}








