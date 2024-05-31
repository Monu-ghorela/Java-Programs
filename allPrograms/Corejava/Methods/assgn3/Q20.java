package Methods.assgn3;

public class Q20 {
    public static void display(int a,int b,int c,int d ,double avg) {
        System.out.println("the average of "+a+","+b+","+c+","+d+" is "+avg);
    }
    public static void average(int a,int b,int c,int d) {
        double  avg=(a+b+c+d)/4;
        
        display(a,b,c,d,avg);
    }
    public static void main(String[] args) {
        average(40,30,56,78);
    }
}
