package Methods.assgn4;

import java.util.Scanner;

public class Q11 {

  public static char toUpperCaseAndLowererCase(char ch) {
    if (ch >= 'a' && ch <= 'z') {
      ch = (char) (ch - 32);
      return ch;
    } else if (ch >= 'A' && ch <= 'Z') {
      ch = (char) (ch + 32);
      return ch;
    }
    return ' ';
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(
      "enter a char to convert it into upper case and upper case ------->>>  :"
    );
    char ch = sc.next().charAt(0);
    ch = toUpperCaseAndLowererCase(ch);
    System.out.println("the character's conversion is as: " + ch);
  }
}
