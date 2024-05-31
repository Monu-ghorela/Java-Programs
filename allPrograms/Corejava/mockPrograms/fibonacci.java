package mockPrograms;

public class fibonacci {

  public static void main(String[] args) {
    int fibonaccinumber = 0;
    int s = 0;
    int r = 1;
    int n = 4;
    int cnt = 2;
    if (n == 1) {
      fibonaccinumber = s;
    } else if (n == 2) {
      fibonaccinumber = r;
    }
    if (n >= 3) {
      while (cnt < n) {
        fibonaccinumber = r + s;
        s = r;
        r = fibonaccinumber;
        cnt++;
      }
    }
    System.out.println(fibonaccinumber);
  }
}
