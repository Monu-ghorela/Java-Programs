import java.util.Scanner;

public class DivisibleBy6 {

  public static void main(String[] args) {
    System.out.println("enter a no to verify that divisible by 6 or not");
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    if (num % 6 == 0) {
      System.out.println("it is divisible by 6");
    } else {
      System.out.println("it is not divisible by 6");
    }
    // The program prompts the user to enter an integer and then checks whether it is divisible by
  }
}
