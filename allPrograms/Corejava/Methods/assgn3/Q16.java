package Methods.assgn3;
public class Q16 {
    public static void display(double l,double w,double Perimeter) {
        System.out.println("the Perimeter of rectangle having length "+l+"cm and width "+w+"cm is "+Perimeter +" cms");
    }
    public static void PerimeterOfRectangle(double l,double w) {
        display(l,w,2*(l+w));
    }
    public static void main(String[] args) {
        double l=4.1;
        double w=3.2;
        PerimeterOfRectangle(l, w);
        
    }
}
