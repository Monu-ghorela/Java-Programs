package Methods.assgn3;

public class Q25 {

  public static void display(int l, int u, int product) {
    System.out.println(
      "the product of odd numbers from " + l + " to " + u + " is " + product
    );
  }

  public static boolean isOdd(int n) {
    if (n % 2 != 0) {
      return true;
    }
    return false;
  }

  public static void productOfOddNumbers(int l, int u) {
    int product = 1;
    for (int i = l; i <= u; i++) {
      if (isOdd(i)) {
        product *= i;
      }
    }
    display(l, u, product);
  }

  public static void main(String[] args) {
    productOfOddNumbers(20, 30);
  }
}
