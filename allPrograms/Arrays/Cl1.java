package Arrays;
import java.util.*;

public class Cl1 {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int[] arr = { 1, 20, 15, 78 };
    String[] arr2 = { "monu", "ajay", "akhil", "naman" };
    double[] arr3 = { 0.451, .025, 0.63 };

    for (int i = 0; i < arr.length; i++) {
      arr[i]=sc.nextInt();
    }
    System.out.println();
        System.out.println();
    

    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
    // System.out.println();
    // for (int i = 0; i < arr2.length; i++) {
    //   System.out.println(arr2[i]);
    // }
    // System.out.println();
    // for (int i = 0; i < arr3.length; i++) {
    //   System.out.println(arr3[i]);
    // }
    // System.out.println();
  }
}
