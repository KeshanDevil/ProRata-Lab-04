import java.util.Scanner;

public class IT21047756Lab3Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter monthly salary: ");
        double monthlySalary = input.nextDouble();

        System.out.print("Enter number of OT hours: ");
        double otHours = input.nextDouble();

        System.out.print("Enter OT hourly rate: ");
        double otHourlyRate = input.nextDouble();

        // Calculate OT amount
        double otAmount = otHours * otHourlyRate;

        // Calculate total salary
        double totalSalary = monthlySalary + otAmount;

        System.out.println("OT Amount = " + otAmount);
        System.out.println("Total Salary = " + totalSalary);

        input.close();
    }
}