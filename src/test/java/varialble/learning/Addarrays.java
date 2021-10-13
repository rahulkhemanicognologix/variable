package varialble.learning;

import java.util.Arrays;

public class Addarrays {
    public static void main(String[] args) {



    int[] p = {5, 6, 7, 8, 9, 8};
    int[] l = {1, 2, 3, 2, 4, 4};
    int[] a = new int[6];
    int remainder = 0;


    for (int i=5; i >= 0; i--) {
        a[i] = l[i] + p[i] + remainder;
        if (a[i] >= 10) {
            remainder = a[i] / 10;
            a[i] = a[i] % 10;
        }
        System.out.println(a[i]);
    }
        int[] numbers = {2, 4, 1, 1, 9, 7};
        String newdigits = Arrays.toString(numbers);
        System.out.println(newdigits);
}
}


