import java.util.Arrays;

public class anagram {

  public static void main(String[] args) {
    String s1 = "monu";
    String s2 = "onum";
    s1.toLowerCase();
    s2.toLowerCase();
    if (s1.length() == s2.length()) {
      boolean ans = true;
      char a[] = new char[s1.length()];
      char b[] = new char[s2.length()];

      for (int i = 0; i < b.length; i++) {
        a[i] = s1.charAt(i);
      }
      for (int i = 0; i < b.length; i++) {
        b[i] = s2.charAt(i);
      }
      Arrays.sort(a);
      Arrays.sort(b);

      for (int i = 0; i < b.length; i++) {
        if (a[i] != b[i]) {
          ans = false;
          break;
        }
      }
      if (ans) {
        System.out.println("string aree anagram");
      } else {
        System.out.println("not anagram");
      }
    } else {
      System.out.println("not a anagram");
    }
  }
}
