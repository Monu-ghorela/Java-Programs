package Methods.assgn2;

public class Q5 {

  static void coding(int a, float f, double d, char c, long l, String s) {
    System.out.println(
      "the method coding coding(int a,float f,double d,char c,long l,String s) parametrized method is called which is taking int ,float,double,char,string ,float type of arguments"
    );
  }

  public static void main(String[] args) {
    System.out.println("start");
    coding(10, 10.5f, 50.5, 'A', 101010, "monu is coding ");
    System.out.println("end of execution");
  }
}
