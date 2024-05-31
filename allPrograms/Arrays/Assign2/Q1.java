package Arrays.Assign2;

public class Q1 {

  public static void main(String[] args) {
    char[] a = { 'm','a','l','a','y','a','l','a','m'};
    int start = 0;
    int end = a.length - 1;
    boolean ans = true;
    while (start <= end) {
      if (a[start] != a[end]) {
        ans = false;
        break;
      }
      start++;
      end--;

    }
    if (ans) {
      System.out.println("it is a pallindrome ");
    } else {
      System.out.println("it is not  a pallindrome");
    }

  }
}
