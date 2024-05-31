public class TypeCasting {

  public static void main(String[] args) {
    int n = 128;

    byte b = (byte) n;
    System.out.println(" int into byte " + b);
    int a = 10;
    System.out.println(a + " before typecasting ");
    // int b = '1';
    double d = a;
    a = (int) d;
    System.out.println(a + " after casting ");
    // System.out.println(b);
    System.out.println(d + " value in a to double");
    // System.out.println(a);
    int c=235;
    char ch=(char)c;
    
    System.out.println(ch+"   value of c into char");
  }
}
