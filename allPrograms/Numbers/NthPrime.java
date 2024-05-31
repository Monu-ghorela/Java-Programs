package Numbers;

public class NthPrime {

  public static void main(String[] args) {
    int n = 5;
    int cnt = 0;
    int i = 1;
    int Nprime = 0;
    while (cnt < n) {
      boolean ans = true;
      if (i == 1) {
        i++;
        continue;
      }
      if (i == 2) {
        cnt++;
        Nprime = i;
        i++;
        System.out.println(Nprime);
        continue;
      }

      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          ans = false;
          break;
        }
      }
      if (ans) {
        cnt++;
        Nprime = i;
        System.out.println(Nprime);
      }
      i++;
    }
    System.out.println(Nprime);
  }
}
