package Methods.assgn3;

public class Q17 {

  public static void displayArea(double l, double area) {
    System.out.println(
      "the area of square having side " + l + "cm is " + area + " cm sqaure"
    );
  }

  public static void areaOfsquare(double l) {
    displayArea(l, (l * l));
  }
  public static void displayPerimeter(double l, double perimeter) {
      System.out.println(
        "the perimeter of sqare having side " + l + "cm is " + perimeter + " cm sqaure"
      );
    }
  
    public static void perimeterOfsquare(double l) {
      displayArea(l, (4 * l));
    }

  public static void main(String[] args) {
    double l = 6;

    areaOfsquare(l);
    perimeterOfsquare(l);
  }
}
