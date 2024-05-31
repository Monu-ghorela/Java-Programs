package loops.Assgn2;
//PPP
//OOO
//NNN 
//MMM
public class Q8 {

  public static void main(String[] args) {
    // char a = 'P';
    // for (int i = 1; i <= 4; i++) {
    //   for (int j = 1; j <= 3; j++) {
    //     System.out.print(a);
    //   }
    //   System.out.println();
    //   a--;
    // }

    // int i = 1;
    // char a = 'P';
    // while (i <= 4) {
    //   int j = 1;
    //   while (j <= 3) {
    //     System.out.print(a);
    //     j++;
    //   }
    //   System.out.println();
    //   a--;
    //   i++;
    // }

    int i = 1;
    char a = 'P';
    do {
      int j = 1;

      do {
        System.out.print(a);
        j++;
      } while (j <= 3);
      System.out.println();
      i++;
      a--;
    } while (i <= 4);
  }
}
