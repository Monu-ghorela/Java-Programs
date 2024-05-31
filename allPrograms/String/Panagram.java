package String;

public class Panagram {

  public static void main(String[] args) {
    String s = "abcdAAefghijklmnopqrstuvwxyz";
    int[] a = new int[26];
    if (s.length() >= 26) {
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
          a[s.charAt(i) - 'a'] = 1;
        } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
          a[s.charAt(i) - 'A'] = 1;
        }
      }

      boolean ans = true;
      for (int i = 0; i < a.length; i++) {
        if (a[i] == 0) {
          ans = false;
          break;
        }
      }
      if (ans) {
        System.out.println("this  is a panagram");
      } else {
        System.out.println("this is not a panagram");
      }
    } else {
      System.out.println("it is not a panagram");
    }
  }
}
