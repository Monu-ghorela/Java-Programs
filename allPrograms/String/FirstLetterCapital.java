package String;


public class FirstLetterCapital {

  public static String convert(String word) {
    int num = word.charAt(0);
    String s2 = "";
    if (num > 96 && num < 123) {
      num -= 32;
      s2 += (char) num;
      for (int i = 1; i < word.length(); i++) {
        s2 += word.charAt(i);
      }
    }
    return s2 + " ";
  }

  public static void main(String[] args) {
    String s = "this is a monu ghorela";
    String s1 = "";
    String word = "";

    for (int i = 0; i < s.length(); i++) {
      int num = s.charAt(i);
      num = (char) num;
      //   System.out.println(num);
      if (i == s.length() - 1) {
        word += s.charAt(i);
        word = convert(word);
        s1 += word;
        word = "";
      }
      if (num == ' ') {
        word = convert(word);
        s1 += word;
        word = "";
      } else {
        word += s.charAt(i);
      }
    }
    System.out.println(s1);
  }
}
