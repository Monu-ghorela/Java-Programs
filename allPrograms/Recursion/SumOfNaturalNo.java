package Recursion;

public class SumOfNaturalNo {

  public static int Sum(int n) {
    if (n < 1) {
      return 0;
    }
    return n + Sum(n - 1);
  }

  public static void main(String[] args) {
    int n = 2;
    System.out.println("Sum of natural no is " + Sum(n));
  }
}
