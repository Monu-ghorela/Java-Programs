package Arrays;

public class mergeTwoArray {
    public static void main(String[] args) {
        int a[]={10,20,30};
        int b[]={40,50,60};
        int c[]=new int[a.length+b.length];
        int k=0;
        for (int i = 0; i < c.length; i++) {
            
            if(i<a.length){
                c[i]=a[i];

            }else{
                c[i]=b[k++];

            }
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
