package patterns;

public class Ptr27 {
    public static void main(String[] args) {
        int n=3;
        for (int i =1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                
            }
            for (int j = 1; j <=2*(n-i); j++) {
                System.out.print(" ");
                
            }
            for (int j2 = 1; j2 <=i; j2++) {
                System.out.print("*");
                
            }
           System.out.println(); 
        }
         for (int i =n-1; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                
            }
            for (int j = 1; j <=2*(n-i); j++) {
                System.out.print(" ");
                
            }
            for (int j2 = 1; j2 <=i; j2++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
}
