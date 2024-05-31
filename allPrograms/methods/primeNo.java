public class primeNo {

  public static boolean Primeno(int n) {
  
    for (int i = n - 1; i > 1; i--) {
      if (n % i == 0) {
      return false;
    
      }
    }
    return true;
  }

  public static void main(String[] args) {
  int st=10;
  int end=60;
  for (int i = st; i <=end; i++) {
    
    if (Primeno(i)) {
        System.out.println(i);
    }
  }


  }
}
