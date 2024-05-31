package loops.assgn;

public class Q3 {

  public static void main(String[] args) {
    for (int i = 5; i <= 25; i += 5) {
      System.out.println(i);
    }

    int i = 5;
    System.out.println();
    while (i <= 25) {
      System.out.println(i);
      i += 5;
    }

    System.out.println();
    int j = 5;
    do {
      System.out.println(j);
      j += 5;
    } while (j <= 25);
  }
}
