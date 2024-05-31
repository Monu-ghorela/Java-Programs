package Arrays;

public class MaxOfArray {
    public static void main(String[] args) {
        int []a={-1,-5,-10,-15,-48,-78,-112,1};
        int max=a[0];
       for (int i = 0; i < a.length; i++) {
        if(a[i]>max){
            max=a[i];
        }
       } 
       System.out.println("maximum of arrray is "+max);

        
    }
}
