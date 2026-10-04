
import java.util.Scanner; // Import Scanner for keyboard input

public class IT21047756Lab4Q2 {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Input exam marks
        System.out.print("Enter exam marks: ");
        double examMarks = input.nextDouble();

        // Validate exam marks (0 to 100)
        while (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid marks! Enter marks between 0 and 100.");
            System.out.print("Enter exam marks again: ");
            examMarks = input.nextDouble();
        }

        // Input lab submission marks
        System.out.print("Enter lab submission marks: ");
        double labMarks = input.nextDouble();

        // Validate lab marks (0 to 100)
        while (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid marks! Enter marks between 0 and 100.");
            System.out.print("Enter lab marks again: ");
            labMarks = input.nextDouble();
        }

        // Input exam percentage
        System.out.print("Enter exam percentage: ");
        double examPercentage = input.nextDouble();

        // Input lab percentage
        System.out.print("Enter lab percentage: ");
        double labPercentage = input.nextDouble();

        // Validate that both percentages add up to 100
        while (examPercentage + labPercentage != 100) {
            System.out.println("Invalid percentages! They must add up to 100.");

            System.out.print("Enter exam percentage again: ");
            examPercentage = input.nextDouble();

            System.out.print("Enter lab percentage again: ");
            labPercentage = input.nextDouble();
        }

        // Calculate the weighted final mark
        double finalMark = (examMarks * examPercentage / 100)
                         + (labMarks * labPercentage / 100);

        // Display the final mark
        System.out.println("Final mark: " + finalMark);

        // Close Scanner
        input.close();
    }
}