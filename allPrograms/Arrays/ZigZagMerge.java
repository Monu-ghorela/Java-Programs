package Arrays;

public class ZigZagMerge {

  public static void main(String[] args) {
    int a[] = { 10, 20, 30 ,50,60,80 ,45121};
    int b[] = { 40, 50, 60,40,50};
    int j = 0;
    int k = 0;

    int c[] = new int[a.length + b.length];

    // for (int i = 0; i < c.length; i++) {
    //   if (j < a.length && (i % 2 == 0)) {
    //     c[i] = a[j++];
    //   } else if (k < b.length && (i % 2 != 0)) {
    //     c[i] = b[k++];
    //   } else if (k >= a.length) {
    //     c[i] = b[k++];
    //   } else {
    //     c[i] = a[j++];
    //   }
    // }
    for (int i = 0; i < c.length; i++) {
        
        if(j<a.length){
            c[i]=a[j++];
            i++;
        }
        if(k<b.length){
            c[i]=b[k++];
        }else{
            i--;
        }
    }
    for (int i = 0; i < c.length; i++) {
      System.out.println(c[i]);
    }
  }
}
