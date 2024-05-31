package Assgn5;

public class Q3 {

  public static void main(String[] args) {
    int number = 2550;
    boolean isduck =true;
    while (number > 0) {
      int digit = number % 10;
      if (digit == 0) {
        isduck = true;
        break;
      }
      number = number / 10;
    }
    if (isduck) {
      System.out.println("this is  a duck numbner ");
    } else {
      System.out.println("this is  not a duck numbner ");
    }
  }
}
