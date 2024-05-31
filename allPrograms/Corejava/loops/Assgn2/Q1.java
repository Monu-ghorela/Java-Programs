package loops.Assgn2;
//ABC
//ABC
//ABC
public class Q1 {

  public static void main(String[] args) {
    //----for loop

    // for (int i = 1; i <= 3; i++) {
    //   char a = 'A';
    //   for (int j = 1; j <= 3; j++) {
    //     System.out.print(a++);
    //   }
    //   System.out.println();
    // }

    /////----do while loop

    // int i = 1;
    // do {
    //   int j = 1;
    //   char a = 'A';
    //   do {
    //     System.out.print(a++);
    //     j++;
    //   } while (j <= 3);
    //   System.out.println();
    //   i++;
    // } while (i <= 3);


int i=1;

    while (i<=3) {
        
        int j = 1;
        char a = 'A';
        while (j <= 3) {
          System.out.print(a++);
          j++;
    }
    System.out.println();
    i++;
    }
  }
}
