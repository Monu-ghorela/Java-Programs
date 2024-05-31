package Recursion;

public class EvenNoSeries {

  public static void odd(int cnt, int n, int num) {
    if (cnt > n) {
      return;
    }
    num = num + 2;
    System.out.println(num);
    cnt++;
    odd(cnt, n, num);
  }

  public static void main(String[] args) {
    int n = 10;
    int num = 0;
    int cnt = 0;
    odd(cnt, n, num);
  }
}
