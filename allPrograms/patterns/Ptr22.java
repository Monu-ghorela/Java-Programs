class Ptr22 {

  public static void main(String[] args) {
    int n = 7;
    int m = 4;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        if (i == 1 || i == n || (i + j )== (n + 1) || i == j) {
          System.out.print("* ");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
