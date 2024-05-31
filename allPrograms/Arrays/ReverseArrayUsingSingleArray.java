package Arrays;

public class ReverseArrayUsingSingleArray {
    
    public static void main(String[] args) {
        char a[]={'a','b','c'  };
        int start=0;
        int end=a.length-1;
        // int mid=start+end/2;
        while (start<end) {
          char temp=a[start];
          a[start]=a[end];
          a[end]=temp;
          start++;
          end--;

            
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
