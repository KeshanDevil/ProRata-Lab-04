import java.util.Scanner;

public class IT21047756Lab3Q1A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double price = input.nextDouble();

        System.out.print("Enter the number of kilograms: ");
        double kilograms = input.nextDouble();

        double amount = price * kilograms;

        System.out.println("Amount you have to pay = " + amount);

        input.close();
    }
}