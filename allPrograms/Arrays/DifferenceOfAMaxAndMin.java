package Arrays;
public class DifferenceOfAMaxAndMin {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3,5,4,8,2,9};
        int max=array[0];
        int min =array[0];

        for (int i = 0; i < array.length; i++) {
            if(array[i]>max)
            {
                max=array[i];

            }
            if(array[i]<min)
            {
                min =array[i];
            }
        }
        System.out.println(" the diffferenec of max and min is "+ (max-min));
    }
}