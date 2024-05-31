package loops.assgn;

public class Q7 {

  public static void main(String[] args) {
    for (int i = 5; i <= 625; i *= 5) {
      System.out.println(i);
    }
    System.out.println();
    int i = 5;
    while (i <= 625) {
      System.out.println(i);
      i *= 5;
    }
    int j = 5;
    System.out.println();
    do {
        System.out.println(j);
        j*=5;
    } while (j <= 625);
  }
}
