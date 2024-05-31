package numberPrograms;

// factors of number
public class Q1 {

  public static void main(String[] args) {
    int n = 6;
    int i = 1;
    while (i <= n) {
      if ((n % i) == 0) {
        System.out.println(i);
      }
      i++;
    }
  }
}
