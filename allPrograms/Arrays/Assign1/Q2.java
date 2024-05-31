package Assign1;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size for array");
        int size=sc.nextInt();
        int []a=new int[size];
        System.out.println("enter the elemets");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
            
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2!=0){
                System.out.println(a[i]);
            }
            
        }

    }
}
