package Arrays;

import java.util.Arrays;

public class Frequency {
    public static void main(String[] args) {
    int a[] = { 10, 20, 30, 10, 20, 30, 40 };
    boolean[] visited = new boolean[a.length];
    Arrays.fill(visited, false);
  
    for (int i = 0; i < a.length; i++) {
      if (visited[i] == true) {
        continue;
      }
      int count = 1; 
      for (int j = i + 1; j < a.length; j++) {
        // if (visited[i] == true) {
        //   continue;
        // }
        if (a[i] == a[j]) {
          count++;
          visited[j] = true;
        }
      }
      System.out.println("count of elemcytt of " + a[i] + " is " + count);
    }
  }
}
