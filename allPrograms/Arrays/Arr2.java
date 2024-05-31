////searching in an array

package Arrays;

import java.util.Scanner;

public class Arr2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a size ");
    int size = sc.nextInt();
    //creating the array

    int arr[] = new int[size];
    System.out.println("enter the elemnts ");
    for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.nextInt();
    }
    System.out.println("enter a no to search ");
    int x = sc.nextInt();
    for (int i = 0; i < size;) {
      if (x == arr[i]) {
        System.out.println("number is presnet at " + i);
        break;
      } else {
        i++;
      }
    }
  }
}
