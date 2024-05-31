package Methods.assgn4;
import java.util.*;
public class Q1 {

  public static int product(int a, int b) {
    return a * b;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter two numbers ");
    System.out.print("enter first number-----> :");
    int a=sc.nextInt();
    System.out.println();
    System.out.print("enter second number ");
    int b=sc.nextInt();
    int product=product(a, b);
    System.out.println("the product of "+a+" and "+b +" is "+product);
  }
}
