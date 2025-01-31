package question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Currency Converter");
        System.out.println("2. Distance Converter");
        System.out.println("3. Time Converter");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("1. Dollar to Gh");
                System.out.println("2. Gh to Dollar");
                System.out.println("3. Euro to Gh");
                System.out.println("4. Gh to Euro");
                System.out.println("5. Yen to Gh");
                System.out.println("6. Gh to Yen");
                System.out.print("Choose an option: ");
                int currencyChoice = scanner.nextInt();
                System.out.print("Enter amount: ");
                double amount = scanner.nextDouble();

                switch (currencyChoice) {
                    case 1:
                        System.out.println("Dollar to Gh: " + CurrencyConverter.dollarToGh(amount));
                        break;
                    case 2:
                        System.out.println("Gh to Dollar: " + CurrencyConverter.ghToDollar(amount));
                        break;
                    case 3:
                        System.out.println("Euro to Gh: " + CurrencyConverter.euroToGh(amount));
                        break;
                    case 4:
                        System.out.println("Gh to Euro: " + CurrencyConverter.ghToEuro(amount));
                        break;
                    case 5:
                        System.out.println("Yen to Gh: " + CurrencyConverter.yenToGh(amount));
                        break;
                    case 6:
                        System.out.println("Gh to Yen: " + CurrencyConverter.ghToYen(amount));
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
                break;

            case 2:
                System.out.println("1. Meter to Km");
                System.out.println("2. Km to Meter");
                System.out.println("3. Miles to Km");
                System.out.println("4. Km to Miles");
                System.out.print("Choose an option: ");
                int distanceChoice = scanner.nextInt();
                System.out.print("Enter distance: ");
                double distance = scanner.nextDouble();

                switch (distanceChoice) {
                    case 1:
                        System.out.println("Meter to Km: " + DistanceConverter.meterToKm(distance));
                        break;
                    case 2:
                        System.out.println("Km to Meter: " + DistanceConverter.kmToMeter(distance));
                        break;
                    case 3:
                        System.out.println("Miles to Km: " + DistanceConverter.milesToKm(distance));
                        break;
                    case 4:
                        System.out.println("Km to Miles: " + DistanceConverter.kmToMiles(distance));
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
                break;

            case 3:
                System.out.println("1. Hours to Minutes");
                System.out.println("2. Minutes to Hours");
                System.out.println("3. Hours to Seconds");
                System.out.println("4. Seconds to Hours");
                System.out.print("Choose an option: ");
                int timeChoice = scanner.nextInt();
                System.out.print("Enter time: ");
                double time = scanner.nextDouble();

                switch (timeChoice) {
                    case 1:
                        System.out.println("Hours to Minutes: " + TimeConverter.hoursToMinutes(time));
                        break;
                    case 2:
                        System.out.println("Minutes to Hours: " + TimeConverter.minutesToHours(time));
                        break;
                    case 3:
                        System.out.println("Hours to Seconds: " + TimeConverter.hoursToSeconds(time));
                        break;
                    case 4:
                        System.out.println("Seconds to Hours: " + TimeConverter.secondsToHours(time));
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}