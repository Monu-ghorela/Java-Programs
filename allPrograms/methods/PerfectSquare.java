// import Numbers.Power;

public class PerfectSquare {

  public static boolean isPerfectSquare(int num) {
    boolean ans = false;
    for (int i = 1; i <= num; i++) {
      if (num == i * i) {
        // System.out.println();
        ans = true;
        return ans;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    System.out.println(isPerfectSquare(1));
    System.out.println(isPerfectSquare(4));
    System.out.println(isPerfectSquare(9));
  }
}
