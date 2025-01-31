package question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Consumer No: ");
        String consumerNo = scanner.nextLine();

        System.out.print("Enter Consumer Name: ");
        String consumerName = scanner.nextLine();

        System.out.print("Enter Previous Month Reading: ");
        int previousMonthReading = scanner.nextInt();

        System.out.print("Enter Current Month Reading: ");
        int currentMonthReading = scanner.nextInt();

        System.out.print("Enter Connection Type (Domestic/Commercial): ");
        String connectionType = scanner.next();

        ElectricityBill bill = new ElectricityBill(consumerNo, consumerName, previousMonthReading, currentMonthReading, connectionType);
        bill.displayBill();
    }
}