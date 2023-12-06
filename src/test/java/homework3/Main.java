package homework3;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var currencyCovertor = new CurrencyCovertor(0.01,36.55);
    System.out.println("Enter the amount in USD: ");
    double usdAmount = scanner.nextDouble();

    double uahAmount = currencyCovertor.calculateTotalAmount(usdAmount);
    System.out.println(usdAmount + " USD is equal to " + uahAmount + " UAH");

  }
}
