import java.util.Scanner;

class Calculator {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the choice");

    System.out.println("enter 1:addition");
    System.out.println("enter 2:multiplication");
    System.out.println("enter 3:division");
    System.out.println("enter 4:subtraction");
    System.out.println("enter 5:modulus");
    int choice = s.nextInt();
int a=0;
    int b=0;
    
    if(choice>0&& choice<=5){
        
        System.out.println("enter the values ");
         a = s.nextInt();
         b = s.nextInt();
    }



    switch (choice) {
      case 1:
        System.out.println(division(a, b));
        break;
      case 2:
        System.out.println(division(a, b));
        break;
      case 3:
        System.out.println(division(a, b));
        break;
      case 4:
        System.out.println(sub(a, b));
        break;
      case 5:
        System.out.println(mod(a, b));
        break;
      default:
        System.out.println("enter a valid no");
    }
  }

  public static int add(int a, int b) {
    return (a + b);
  }

  public static int multiplication(int a, int b) {
    return (a * b);
  }

  public static int division(int a, int b) {
    return (a / b);
  }

  public static int sub(int a, int b) {
    return (a - b);
  }

  public static int mod(int a, int b) {
    return (a % b);
  }
}
