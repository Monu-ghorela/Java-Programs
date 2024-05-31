package Methods.assgn3;

public class Q11 {

  public static void display(int number, int sum) {
    System.out.println("the sum of Prime digits of " + number + " is " + sum);
  }

  public static boolean digitIsPrime(int digit) {
    if (digit==1) {
        return false;
        
    }
    if (digit == 2) {
        System.out.println("prime "+digit);
      return true;
    }
    for (int i = 2; i < digit; i++) {
      if (digit % i == 0) {
        System.out.println("prime "+digit);

        return false;
      }
    }
    return true;
  }

  public static void sumOfPrimeDigits(int number) {
    int sum = 0;
    int orig = number;
    while (number > 0) {
      int digit = number % 10;
      if (digitIsPrime(digit)) {
        sum += digit;
      }
      number /= 10;
    }
    display(orig, sum);
  }

  public static void main(String[] args) {
    int number = 143552;
    sumOfPrimeDigits(number);
  }
}
