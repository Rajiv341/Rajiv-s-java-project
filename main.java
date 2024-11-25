import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Currency Converter!");

        // Define exchange rates (for example, USD to other currencies)
        double usdToEur = 0.94;  // 1 USD to EUR
        double usdToGbp = 0.81;  // 1 USD to GBP
        double usdToInr = 83.05; // 1 USD to INR

        // Show currency options
        System.out.println("Choose the currency to convert from (USD):");
        System.out.println("1. EUR (Euro)");
        System.out.println("2. GBP (British Pound)");
        System.out.println("3. INR (Indian Rupee)");
        System.out.print("Enter the number of the currency: ");
        int choice = scanner.nextInt();

        // Get the amount to convert
        System.out.print("Enter the amount in USD: ");
        double amount = scanner.nextDouble();

        double convertedAmount = 0;

        switch (choice) {
            case 1:
                convertedAmount = amount * usdToEur;
                System.out.println(amount + " USD = " + convertedAmount + " EUR");
                break;
            case 2:
                convertedAmount = amount * usdToGbp;
                System.out.println(amount + " USD = " + convertedAmount + " GBP");
                break;
            case 3:
                convertedAmount = amount * usdToInr;
                System.out.println(amount + " USD = " + convertedAmount + " INR");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
