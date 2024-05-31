package Methods.assgn3;

public class Q28 {

  public static void display(int n, int fact) {
    System.out.println("the factorial of number " + n + " is " + fact);
  }

  public static void factorial(int n) {
    int fact = n;
    for (int i = 1; i < n; i++) {
      fact *= i;
    }
    display(n, fact);
  }

  public static void main(String[] args) {
    factorial(10);
    factorial(8);
  }
}
