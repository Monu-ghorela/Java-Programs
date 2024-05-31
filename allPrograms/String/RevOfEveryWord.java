package String;

public class RevOfEveryWord {

  public static String reverse(String s) {
    String s2 = "";
    for (int i = s.length() - 1; i >= 0; i--) {
      s2 += s.charAt(i);
    }
    return s2;
  }

  public static void main(String[] args) {
    String s = " this is called java ";
    String s1 = "";
    String word = "";
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (ch == ' ') {
        word = reverse(word);
        s1 += word + " ";
        word = "";
      } else if (i == s.length() - 1) {
        word += s.charAt(i);
        word = reverse(word);
        s1 += word + " ";
        word = "";
      } else {
        word += ch;
      }
    }
    System.out.println(s1);
  }
}
