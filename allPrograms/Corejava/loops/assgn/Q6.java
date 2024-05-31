package loops.assgn;

public class Q6 {

  public static void main(String[] args) {
    for (int i = 3; i <= 81; i *= 3) {
      System.out.println(i);
    }
    System.out.println();
    int i = 3;
    while (i <= 81) {
      System.out.println(i);
      i *= 3;
    }
    int j = 3;
    System.out.println();
    do {
      System.out.println(j);
      j *= 3;
    } while (j <= 81);
  }
}
