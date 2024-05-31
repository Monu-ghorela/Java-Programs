package Assign1;

public class Q6 {
    public static void main(String[] args) {
        int a[]={15,25,45,78,56};
        int b[]=new int[a.length];
        int j=0;
        for (int i =a.length-1 ; i >=0; i--) {
            
            b[j++]=a[i];
        }
        System.out.println("in a reverse order array is like ");
        for (int i = 0; i < b.length; i++) {

            
            System.out.println(b[i]);
        }

    }
    
}
