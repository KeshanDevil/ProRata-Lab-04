
import java.util.Scanner; // Import Scanner for keyboard input

public class IT21047756Lab4Q3 {
    public static void main(String[] args) {

        // Create Scanner object to get input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Use the ternary operator to check the number
        String result = (number > 0) ? "Positive"
                      : (number < 0) ? "Negative"
                      : "Zero";

        // Display the result
        System.out.println("Number is: " + result);

        // Close the Scanner
        input.close();
    }
}