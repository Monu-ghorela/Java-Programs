package Test1;

///strong number
public class Q5 {

  public static void main(String[] args) {
    int n =13 ;
    int orig = n;
    int sum = 0;
    while (n > 0) {
      int digit = n % 10;
      int fact = 1;
      for (int i = digit; i >= 1; i--) {
        fact = fact * i;
      }
      sum = sum + fact;
      n /= 10;
    }
    if (orig == sum) {
      System.out.println("this is a strong  number ");
    } else {
      System.out.println("this is not a strong  number ");
    }
  }
}
