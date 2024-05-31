package String;

public class WithoutSecondString {

  public static void main(String[] args) {
    String s = "java";
    char a[] = new char[s.length()];
    int k = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      a[k] = s.charAt(i);

      k++;
    }
    s = "";
    for (int i = 0; i < a.length; i++) {
      s += a[i];
    }
    System.out.println(s);
  }
}
