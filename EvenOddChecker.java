import java.util.Scanner;

public class EvenOddChecker {

    // Method to get integer input from the user
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            System.out.print("Enter an integer: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear invalid input
            }
        }
        return number;
    }

    // Method to check if the number is even or odd
    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        int userInput = getIntegerInput();
        String result = checkEvenOrOdd(userInput);
        System.out.println(result);
    }
}
