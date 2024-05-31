package numberPrograms;

public class XylumNo {

  public static boolean IsXylum(int i) {
    int n = i;
    int MeanSum = 0;
    int AbstSum = 0;
    while (n > 0) {
      if (n == i || n < 10) {
        AbstSum += n % 10;
      } else {
        MeanSum += n % 10;
      }
      n /= 10;
    }
    if (AbstSum == MeanSum) {
      return true;
    }

    return false;
  }

  public static void main(String[] args) {
    for (int i = 1; i <= 1000; i++) {
    
        if (IsXylum(i)) {
          System.out.println("it is a xylum no. " + i);
        
      }
    }
    // System.out.println(count);
  }
}
