import java.util.Scanner;

import javax.print.attribute.standard.Sides;

public class WithNewKeyword {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a size for the array");

    int size = sc.nextInt();
    //..... fior integer typope of data 


    // int a[] = new int[size];
    //     System.out.println("enter thwew values  for the array");
    
    // for (int i = 0; i < a.length; i++) {
    //   a[i] = sc.nextInt();
    // }
    // System.out.println();
    //     System.out.println("the array values are");
    
    // for (int i = 0; i < a.length; i++) {
    //     System.out.println(a[i]);
        
    // }
    // for string type of data//
    String []a=new String[size];
    System.out.println("enter the names of the students  ");
    for (int i = 0; i < a.length; i++) {
        a[i]=sc.nextLine();
    }
    System.out.println(" the names os the studnts are ");
     for (int i = 0; i < a.length; i++) {
          System.out.println(a[i]);
        }
  }
}
