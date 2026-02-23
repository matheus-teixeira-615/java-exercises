import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter currencyConverter = new CurrencyConverter();

        System.out.println("What is the dollar price? ");
        currencyConverter.dollarPrice = scanner.nextDouble();

        System.out.println("How many dollar will be bought? ");
        currencyConverter.dollarBought = scanner.nextDouble();

        System.out.printf("Amount to be paid in reais = %f.4", currencyConverter.converter());

        scanner.close();
    }
}