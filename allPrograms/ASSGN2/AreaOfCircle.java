import java.util.Scanner;

class AreaOfCircle {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double pi = 3.14;
    System.out.println("Enter a radius to evaluate area of circle ");
    double radius = s.nextFloat();
    double area = pi * radius * radius;
    System.out.println("area of circle is");
    System.out.println(area);
  }
}
