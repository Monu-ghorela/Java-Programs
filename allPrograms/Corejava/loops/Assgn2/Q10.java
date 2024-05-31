package loops.Assgn2;
//123
//456
//789
public class Q10 {

  public static void main(String[] args) {
    // int a=1;
    // for (int i = 1; i <=3; i++) {
    //     for (int j = 1; j <=3; j++) {

    //         System.out.print(a++);
    //     }
    //     System.out.println();

    // }

    // int i = 1;
    // int a = 1;
    // while (i <= 3) {
    //   int j = 1;
    //   while (j <= 3) {
    //     System.out.print(a++);
    //     j++;
    //   }
    //   System.out.println();
    //   i++;
    // }

    int i = 1;
    int a = 1;
    do {
      int j = 1;
      do {
        System.out.print(a++);
        j++;
      } while (j <= 3);
      System.out.println();
      i++;
    } while (i <= 3);
  }
}
