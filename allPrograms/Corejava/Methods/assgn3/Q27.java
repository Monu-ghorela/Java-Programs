package Methods.assgn3;

public class Q27 {

  public static void displaySum(int n, int sum) {
    System.out.println("the sum of factors of the number " + n + " is " + sum);
  }

  public static void sumOfFactors(int n) {
    int sum = 0;

    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        sum += i;
      }
    }

    displaySum(n, sum);
  }

  public static void displayProduct(int n, int product) {
    System.out.println(
      "the product of factors of the number " + n + " is " + product
    );
  }

  public static void productOfFactors(int n) {
    int product = 1;

    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        product *= i;
      }
    }

    displayProduct(n, product);
  }

  public static void main(String[] args) {
    sumOfFactors(6);
    sumOfFactors(9);
    productOfFactors(6);
    productOfFactors(12);
  }
}
