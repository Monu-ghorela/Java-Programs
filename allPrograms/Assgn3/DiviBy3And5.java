import java.util.Scanner;

public class DiviBy3And5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a no to verify a number is divisible by 3 and 5");
    int n = sc.nextInt();
    if (n % 3 == 0 && n % 5 == 0) {
      System.out.println("number is divisible by 3 and 5");
    } else {
      System.out.println("number is not divisible by one or both 3 and 5");
    }
  }
}
