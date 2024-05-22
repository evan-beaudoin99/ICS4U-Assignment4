/**
 * This is the hourglass program.
 * 
 * By: Evan Beaudoin
 * Version: 1.0
 * Since: 2024-05-22
 */

import java.util.Scanner;

final class Hourglass {

    /**
     * Prints an hourglass pattern of asterisks with the given size.
     * 
     * @param size The number of asterisks in the widest part of the hourglass.
     */
    public static void printHourglass(int size) {
        // Base case
        if (size == 1) {
            System.out.println("*");
            System.out.println("*");
            return;
        }

        System.out.println("*".repeat(size));

        printHourglass(size - 1);

        System.out.println("*".repeat(size));
    }

    /**
     * Main method to read user input and call the printHourglass method.
     * 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInput = 0;

        try {
            userInput = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid integer.");
            scanner.close();
            return;
        }

        printHourglass(userInput);

        scanner.close();
    }
}

