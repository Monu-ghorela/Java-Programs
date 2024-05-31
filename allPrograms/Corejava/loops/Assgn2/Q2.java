package loops.Assgn2;
//
public class Q2 {

  public static void main(String[] args) {
    //CDEF
    //CDEF
    //CDEF
    //--for loop

    // for (int i = 1; i <= 3; i++) {
    //   char a = 'C';
    //   for (int j = 1; j <= 4; j++) {
    //     System.out.print(a++);
    //   }
    //   System.out.println();
    // }

    /////----do while loop

    // int i = 1;
    // do {
    //   int j = 1;
    //   char a = 'C';
    //   do {
    //     System.out.print(a++);
    //     j++;
    //   } while (j <= 4);
    //   System.out.println();
    //   i++;
    // } while (i <= 3);

    int i = 1;

    while (i <= 3) {
      int j = 1;
      char a = 'C';
      while (j <= 4) {
        System.out.print(a++);
        j++;
      }
      System.out.println();
      i++;
    }
  }
}
