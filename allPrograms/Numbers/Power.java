package Numbers;

public class Power {

  public static void main(String[] args) {
    int n = 2;
    int power = 5;
    int ans = 1;
    if (power == 0) {
      ans = 1;
    } else {
      for (int i = 1; i <= power; i++) {
        ans = ans * n;
      }
    }
    System.out.println(ans);
  }
}
