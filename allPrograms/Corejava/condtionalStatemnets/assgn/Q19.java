package condtionalStatemnets.assgn;

public class Q19 {
    public static void main(String[] args) {
        int yr=2000;
        if((yr%4==0&&yr%100!=0)||(yr%400==0))
        System.out.println("this "+yr+" is  a leap year ");
    }
}
