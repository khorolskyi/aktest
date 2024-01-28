package homework9;
import java.util.stream.Stream;

public class FibonacciReduce {
  public static void main(String[] args) {
   int n = 10;
    long fibonacciNumber = calculateFibonacci(n);
    System.out.println("The " + n + "-th Fibonacci number is: " + fibonacciNumber);
  }
  public static long calculateFibonacci(int n) {
    int res = Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
        .limit(n - 1)
        .reduce((arr1, arr2) -> arr2)
        .orElse(new int[]{n <= 1 ? n : 0, 0})[1];
    return res;
  }
}