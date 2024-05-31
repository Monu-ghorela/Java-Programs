import java.util.Scanner;

class AreaOfRectanglePerime {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println(
      "Enter length and width of rectangle to evaluate perimeter and area of rectangle"
    );
    double length = s.nextFloat();

    double width = s.nextFloat();

    double Area = length * width;
    double perimeter = 2 * (length + width);

    System.out.println("The area and perimeter of rectangle is  ");
    System.out.println(Area);
    System.out.println(perimeter);
  }
}
