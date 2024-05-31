package Methods.assgn3;

public class Q37 {

  public static String m(int a, int b, double d, float f) {
    return "Monu..u are a nice person";
  }

  public static void main(String[] args) {
    int a = 30;
    int b = 50;
    double d = 500.55;
    float f = 50.4f;

    String greet = m(a, b, d, f);
    System.out.println("the greet send by the method is \n<---------"+greet+"----------->");
  }
}
