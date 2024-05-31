import java.util.Scanner;

class OddEven {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a no to verify wwhether no is odd or even ");
    int number = s.nextInt();
    number = number % 2;
    switch (number) {
      case 0:
        {
          System.out.println("number is even ");
        }
        break;
      case 1:
        {
          System.out.println("number is odd");
        }
        break;
    
    }
  }
}
