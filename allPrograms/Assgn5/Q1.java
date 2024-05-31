package Assgn5;

public class Q1 {

  public static boolean isPerfSquare(int num) {
    if (num == 1) {
      return true;
    }
    for (int i = 1; i <= num / 2; i++) {
      if (i * i == num) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int start = 15;
    int end = 50;
    for (int i = start; i <= end; i++) {
      if (isPerfSquare(i)) {
        System.out.println(i);
      }
    }
  }
}
