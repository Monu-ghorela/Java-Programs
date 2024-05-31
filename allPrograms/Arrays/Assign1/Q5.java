package Assign1;

public class Q5 {
    public static void main(String[] args) {
        int []a={1,25,45,56,85};
        int[]b=new int[a.length];
        for (int i = 0; i < b.length; i++) {
            b[i]=a[i];
            
        } 
        for (int i = 0; i < b.length; i++) {
            System.out.println("element at inde "+i+" of second array "+b[i]);
            
        }
    }
}
