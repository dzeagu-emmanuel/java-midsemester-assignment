package question5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Append");
            System.out.println("2. Insert");
            System.out.println("3. Search");
            System.out.println("4. List all strings starting with a letter");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a string to append: ");
                    String appendString = scanner.nextLine();
                    stringList.add(appendString);
                    System.out.println("String appended.");
                    break;

                case 2:
                    System.out.print("Enter index to insert at: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter a string to insert: ");
                    String insertString = scanner.nextLine();
                    if (index >= 0 && index <= stringList.size()) {
                        stringList.add(index, insertString);
                        System.out.println("String inserted.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 3:
                    System.out.print("Enter a string to search: ");
                    String searchString = scanner.nextLine();
                    if (stringList.contains(searchString)) {
                        System.out.println("String found in the list.");
                    } else {
                        System.out.println("String not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter a letter: ");
                    char letter = scanner.nextLine().charAt(0);
                    System.out.println("Strings starting with '" + letter + "':");
                    for (String str : stringList) {
                        if (str.startsWith(String.valueOf(letter))) {
                            System.out.println(str);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
