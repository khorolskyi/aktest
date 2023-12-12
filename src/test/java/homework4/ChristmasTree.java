package homework4;

public class ChristmasTree {
  public static void main(String[] args) {
    int rows = 30;
    System.out.println();
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= rows - i; j++) {
        System.out.print(" ");
      }
      for (int b = 1; b <= 1 * i - 1; b++) {
        System.out.print(" *");
      }
      System.out.println();
    }
    }
}
