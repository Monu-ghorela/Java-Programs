package String;

public class Pallindrome {

  public static void main(String[] args) {
    String s = "namana";
    int start = 0;
    int end = s.length()-1;
    boolean ans = true;
    while (start < end) {
      if (s.charAt(end) != s.charAt(start)) {
        ans = false;
        break;
      }
      start++;
      end--;
    }
    if (ans) {
      System.out.println(" this is a pallindrome string");
    } else {
      System.out.println(" this is not a pallindrome string");
    }
  }
}
