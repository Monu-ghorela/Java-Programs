package Numbers;

public class pallindrome {

  public static void main(String[] args) {
    int n = 101;
    int orig = n;
    int temp = 0, remaind;
    while (n > 0) {
      remaind = n % 10;
      temp = temp * 10 + remaind;
      n = n / 10;
    }
    if (orig == temp) {
      System.out.println("pallindrome");
    } else {
      System.out.println("not a palindrome");
    }
  }
}
