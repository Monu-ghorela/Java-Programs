package Test1;

public class Q3 {
    public static void main(String[] args) {
        int n=141;
        int orig=n;
        int sum=0;
        while (n>0) {
            int remainder=n%10;
            sum=sum*10+remainder;
            n=n/10;
        }
        if(sum==orig)
        {
            System.out.println("it is a pallindrome");
        }else{
            System.out.println("it is not a pallindrome");
        }
    }
}
