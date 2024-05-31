package Methods.assgn3;

public class Q7 {

  public static void sumOfDigits(int a) {
    int sum = 0;
    int orig=a;
    while (a > 0) {
      sum += (a % 10);

      a /= 10;
    }
    Display(orig, sum);
  }

  public static void Display(int a, int sum) {
    System.out.println("the sum of digits of " + a + " is " + sum);
  }

  public static void main(String[] args) {
    int number = 153;
    sumOfDigits(number);
        sumOfDigits(143);
        sumOfDigits(1432);
    
  }
}
