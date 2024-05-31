package mockPrograms;

public class panagram {

  public static void main(String[] args) {
    String s = "abcdefghijklmnopqrstuvwxyz";
    int a[] = new int[s.length()];
    boolean ans = true;
    for (int i = 0; i < s.length(); i++) {
      a[s.length() - 'a'] = 1;
    }
    for (int i = 0; i < a.length; i++) {
      if (a[i] != 1) {
        ans = false;
        break;
      }
    }
  }
}
