package loops.Assgn2;

public class Q16 {

  public static void main(String[] args) {
    int a = 1;
    for (int i = 1; i <= 3; i++) {
      for (int j = 1; j <= 5; j++) {
        System.out.print(a);
        a = -(--a);
      }
      System.out.println();
    }
    // int i = 1;
    // while (i <= 3) {
    //   int a = 1;
    //   int j = 1;
    //   while (j <= 4) {
    //     System.out.print(a);
    //     a = -(--a);
    //     j++;
    //   }
    //   System.out.println();
    //   i++;
    // }

    // int i = 1;
    // do {
    //   int j = 1;
    //   int a = 1;
    //   do {
    //     System.out.print(a);
    //     a = -(--a);
    //     j++;
    //   } while (j <= 4);
    //   i++;
    //   System.out.println();
    // } while (i <= 3);
  }
}
