import java.util.Scanner;


 class GreatestAge {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the age of first person ");
    int fAge = s.nextInt();
    System.out.println("enter the age of second person ");
    int SAge = s.nextInt();
    System.out.println("enter the age of third person ");
    int Tage = s.nextInt();
    if (fAge > SAge) {
      if (fAge > Tage) {
        System.out.println("the highest age is " + fAge);
      } else {
        System.out.println("the highest age is " + Tage);
      }
    } else if (SAge > Tage) {
      System.out.println("the highest age is " + SAge);
    } else {
      System.out.println("the highest age is " + Tage);
    }
  }
}
