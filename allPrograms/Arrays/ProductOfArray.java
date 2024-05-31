public class ProductOfArray {
    public static void main(String[] args) {
        int [] a={1,5,6,8};
        int product=1;
        for (int i = 0; i < a.length; i++) {
            product*=a[i];

        }
        System.out.println(product);
    }
}
