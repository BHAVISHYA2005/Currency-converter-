import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter amount in USD: ");
        double usd = scanner.nextDouble();
        
        double conversionRate = 0.85; // Example conversion rate to EUR
        double eur = usd * conversionRate;
        
        System.out.printf("Amount in EUR: %.2f\n", eur);
    }
}
