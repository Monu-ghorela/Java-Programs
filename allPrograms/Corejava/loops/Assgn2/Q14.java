package loops.Assgn2;

public class Q14 {

  public static void main(String[] args) {
    // for (int i = 1; i <= 2; i++) {
    //   char a = 'A';
    //   for (int j = 1; j <= 3; j++) {
    //     System.out.print(a);
    //     a += 2;
    //   }
    //   System.out.println();
    // }

    // int i=1;
    // while (i<=2) {
    //     char a='A';
    //     int j=1;
    //     while (j<=3) {
    //         System.out.print(a);
    //         a+=2;
    //         j++;

    //     }
    //     i++;
    //     System.out.println();
    // }

    int i = 1;
    do {
      char a = 'A';
      int j = 1;
      do {
        System.out.print(a);
        a += 2;
        j++;
      } while (j <= 3);
      i++;
      System.out.println();
    } while (i <= 2);
  }
}
