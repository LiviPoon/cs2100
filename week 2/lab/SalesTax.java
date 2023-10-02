/**
This program calculates the total price which includes
sales tax.
*/

import java.util.Scanner; 

public class SalesTax {
    public static void main(String[] args) {
        // Identifier declarations
        final double TAX_RATE = 0.055;


        // Create a Scanner object to read from the keyboard.
        Scanner input = new Scanner(System.in);

        // Display prompts and get input.
        System.out.print("Item description: ");
        String item = input.nextLine();
        System.out.print("Item price: $");
        double price = input.nextDouble();

        // Perform the calculations.
        double tax = price * TAX_RATE;
        double total = price * tax;

        // Display the results.
        System.out.printf("%s $%.2f\n", item, price);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total $%.2f", total);
        }
}