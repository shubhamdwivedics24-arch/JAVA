package Conditional;

import java.util.Scanner;
public class currencyconverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount in INR: ");
        double inr = sc.nextDouble();
        System.out.print("Enter target currency (USD, EUR, GBP, JPY): ");
        String currency = sc.next().toUpperCase();
        double convertedAmount = 0;
        switch(currency) {
            case "USD":
                convertedAmount = inr * 0.013;
                break;
            case "EUR":
                convertedAmount = inr * 0.011;
                break;
            case "GBP":
                convertedAmount = inr * 0.0095;
                break;
            case "JPY":
                convertedAmount = inr * 1.5;
                break;
            default:
                System.out.println("Unsupported currency");
                return;
        }
        System.out.printf("Converted amount: %.2f %s%n", convertedAmount, currency);
    }
}
