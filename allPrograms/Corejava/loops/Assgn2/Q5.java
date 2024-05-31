package loops.Assgn2;
//5 10 15 20
//5 10 15 20
//5 10 15 20

public class Q5 {

  public static void main(String[] args) {
    //--for loop

    // for (int i = 1; i <= 3; i++) {
    // int a=5;
    //   for (int j = 1; j <= 4; j++) {
    //     System.out.print(a+" ");
    // a += 5;
    //   }
    //   System.out.println();
    // }

    /////----do while loop

    // int i = 1;
    // do {
    //   int j = 1;
    // int a=5;

    //   do {
    //     System.out.print(a+" ");
    // a += 5;

    //     j++;
    //   } while (j <= 4);
    //   System.out.println();
    //   i++;
    // } while (i <= 3);

    int i = 1;

    while (i <= 3) {
      int j = 1;
      int a = 5;

      while (j <= 4) {
        System.out.print(a+" ");
            a+=5;
        
        j++;
      }
      System.out.println();
      i++;
    }
  }
}
