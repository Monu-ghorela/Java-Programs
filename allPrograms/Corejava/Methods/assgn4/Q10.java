package Methods.assgn4;

import java.util.Scanner;

public class Q10 {

  public static char toLowerCase(char ch) {
    if (ch >= 'A' && ch <= 'Z') {
      ch = (char) (ch + 32);
      return ch;
    } else if (ch >= 'a' && ch <= 'z') {
      return ch;
    }
    return ' ';
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a char to convert it into lower case------->>>  :");
    char ch = sc.next().charAt(0);
    ch = toLowerCase(ch);
    System.out.println(
      "the character u have inputed is in lower case as: " + ch
    );
  }
}
