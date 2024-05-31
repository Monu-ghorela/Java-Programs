package Methods.assgn3;

public class Q15 {
    public static void display(double l,double w,double area) {
        System.out.println("the area of rectangle having length "+l+"cm and width "+w+"cm is "+area +" cm sqaure");
    }
    public static void areaOfRectangle(double l,double w) {
        display(l,w,(l*w));
    }
    public static void main(String[] args) {
        double l=4;
        double w=5.6;
        areaOfRectangle(l, w);
        
    }
}
