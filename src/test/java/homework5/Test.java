package homework5;
import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введіть перший дріб у форматі numerator/denominator:");
    Fraction fraction1 = createFractionFromInput(scanner);

    System.out.println("Введіть другий дріб у форматі numerator/denominator:");
    Fraction fraction2 = createFractionFromInput(scanner);

    boolean result = fraction1.equals(fraction2);
    System.out.println("Результат порівняння: " + result);
  }

  private static Fraction createFractionFromInput(Scanner scanner) {
    String input = scanner.next();
    String[] parts = input.split("/");
    int numerator = Integer.parseInt(parts[0]);
    int denominator = Integer.parseInt(parts[1]);
    return new Fraction(numerator, denominator);
  }
}
