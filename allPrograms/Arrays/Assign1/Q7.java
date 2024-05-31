package Assign1;

public class Q7 {

  public static void main(String[] args) {
    int a[]={45,12,45,47,58};
    System.out.println("the elemnets present at odd indesxes are ");
    for (int i = 0; i < a.length; i++) {
        if(!(i%2==0)){
           System.out.println(a[i]);
        }
        
    }

  }
}
