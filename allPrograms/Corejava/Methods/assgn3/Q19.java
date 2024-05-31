package Methods.assgn3;

public class Q19 {
    public static void display(int amount,double time,double rOI,double SI) {
        System.out.println("the simple interest of  "+amount+ " on "+ rOI+" % rate of interest for "+time+" years is "+SI );
    }
    public static void simpleIntrest(int amount,int time,double rOI) {
        double t=(double)(time/12);
        double SI=(amount*rOI*t)/100;
        display(amount,t,rOI,SI);
    }
    public static void main(String[] args) {
        int amount=8000000;
        int time=60;
        double rOI=12;
        simpleIntrest(amount, time, rOI);
    }
}
