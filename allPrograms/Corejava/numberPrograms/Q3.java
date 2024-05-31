package numberPrograms;

// count odf even numbers between two number
public class Q3 {

  public static void main(String[] args) {
    int m = 11;
    int n = 200;
    int cnt = 0;
    while (m <= n) {
      if ((m % 2) == 0) {
        cnt++;
      }
      m++;
    }
    System.out.println(cnt);
  }
}
