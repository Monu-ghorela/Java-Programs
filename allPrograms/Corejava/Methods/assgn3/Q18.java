package Methods.assgn3;

public class Q18 {

  public static void display(int n, int fact) {
    System.out.println("the factorial of number " + n + " is " + fact);
  }

  public static void factorial(int n) {
    int fact = n;
    if (n == 0) {
      fact = 1;
    } else {
      for (int i = 1; i < n; i++) {
        fact *= i;
      }
    }
    display(n, fact);
  }

  public static void main(String[] args) {
    int number = 8;
    factorial(number);
    factorial(7);
    factorial(4);
  }
}
