package Methods.assgn4;

import java.util.Scanner;

public class Q9 {

  public static char toUpperCase(char ch) {
    if (ch >= 'a' && ch <= 'z') {
      ch = (char) (ch - 32);
    } else if (ch >= 'A' && ch <= 'Z') {
      return ch;
    }
    return ' ';
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a char to convert it into upper case------->>>  :");
    char ch = sc.next().charAt(0);
    ch = toUpperCase(ch);
    System.out.println(
      "the character u have inputed is in upper case as: " + ch
    );
  }
}
