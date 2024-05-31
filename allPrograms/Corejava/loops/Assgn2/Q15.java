package loops.Assgn2;

public class Q15 {

  public static void main(String[] args) {
    // for (int i = 1; i <=3; i++) {
    //     int a =3;
    //     for (int j = 1; j <=3; j++) {
    //         System.out.print(a+" ");
    //         a*=3;

    //     }
    //     System.out.println();

    // }

    // int i = 1;
    // while (i <= 3) {
    //   int j = 1;
    //   int a = 3;

    //   while (j <= 3) {
    //     System.out.print(a+" ");
    //     a *= 3;
    //     j++;
    //   }
    //   i++;
    //   System.out.println();
    // }

    int i = 1;
    do {
      int j = 1;
      int a = 3;
      do {
        System.out.print(a+" ");
        a *= 3;
        j++;
      } while (j <= 3);
      i++;
      System.out.println();
    } while (i <= 3);
  }
}
