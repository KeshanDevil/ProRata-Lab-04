
import java.util.Scanner; // Import Scanner to get keyboard input

public class IT21047756Lab4Q1 {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter number: ");

        // Read the integer entered by the user
        int number = input.nextInt();

        // Check whether the number is positive
        if (number > 0) {
            System.out.println("Number is: Positive");
        }

        // Check whether the number is negative
        else if (number < 0) {
            System.out.println("Number is: Negative");
        }

        // If it is not positive or negative, it must be zero
        else {
            System.out.println("Number is: Zero");
        }

        // Close the Scanner
        input.close();
    }
}