package com.puralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt for sandwich size
        System.out.println("R - Regular ($5.45)");
        System.out.print("Enter your choice: ");
        char size = input.next().toUpperCase().charAt(0);

        double basePrice;

        if (size == 'R') {
            basePrice = 5.45;
        } else if (size == 'L') {
            basePrice = 8.95;
        } else {
            return;
        }

        // Prompt for age
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        double discount = 0.0;

        // Determine discount
        if (age <= 17) {
            discount = 0.10; // 10% student discount
        } else if (age >= 65) {
            discount = 0.20; // 20% senior discount
        }

        // Calculate final price
        double discountAmount = basePrice * discount;
        double finalPrice = basePrice - discountAmount;

        // Display receipt
        System.out.println("Base Price: $" + basePrice);
        System.out.println("Discount: $" + discountAmount);
        System.out.println("Final Price: $" + finalPrice);

        input.close();
    }
}
