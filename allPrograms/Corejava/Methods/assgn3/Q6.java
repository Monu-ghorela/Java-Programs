package Methods.assgn3;

public class Q6 {

  public static void printDigits(int a) {
    if (a == 0) {
      System.out.println(0);
    } else {
      while (a > 0) {
        System.out.println(a % 10);
        a /= 10;
      }
    }
  }

  public static void main(String[] args) {
    int number = 153;
    printDigits(number);
    printDigits(142);
    printDigits(143);
    printDigits(0);
  }
}
