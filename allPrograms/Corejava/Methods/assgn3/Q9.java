package Methods.assgn3;

public class Q9 {
    public static void display(int number,int sum) {
        
        System.out.println("the sum of even digits of "+number+" is "+sum);
    }

  public static boolean digitIsEven(int digit) {
    if (digit % 2 == 0) {
      return true;
    }
    return false;
  }

  public static void sumOfEvenDigits(int number) {
    int sum = 0;
    int orig = number;
    while (number > 0) {
      int digit = number % 10;
      if (digitIsEven(digit)) {
        sum += digit;
      }
      number /= 10;
    }
    display( orig,sum);
  }

  public static void main(String[] args) {
    int number = 1432;
    sumOfEvenDigits(number);
  }
}
