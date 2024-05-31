package Test1;
//duck nunmber 
public class Q7 {
   public static void main(String[] args) {
    int n=11;
    boolean an=false;
    while (n>0) {
        if(n%10==0){
            an=true;
            break;
        }
        n/=10;
    }
    if(an)
    {
        System.out.println(" this is a duck number ");
    }else{
        System.out.println(" this is not a duck  number ");
    }
   } 
}
