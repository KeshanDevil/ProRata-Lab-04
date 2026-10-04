import java.util.Scanner;

public class IT21047756Lab3Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double price = input.nextDouble();

        System.out.print("Enter the number of kilograms: ");
        double kilograms = input.nextDouble();

        // Calculate total bill
        double totalBill = price * kilograms;

        // Calculate 10% discount
        double discount = totalBill * 0.10;

        // Calculate amount after discount
        double amountToPay = totalBill - discount;

        System.out.println("Total Bill = " + totalBill);
        System.out.println("Discount = " + discount);
        System.out.println("Amount you have to pay = " + amountToPay);

        input.close();
    }
}