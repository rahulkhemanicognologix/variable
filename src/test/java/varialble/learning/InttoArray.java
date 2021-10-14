package varialble.learning;

public class InttoArray {
    public static void main(String[] args) {
        int x = 567892;
        int y = 123242;
        String c = Integer.toString(x);
        String e = Integer.toString(y);
        int[] d = new int[c.length()];
        int[] f = new int[e.length()];
        for (int i = 0; i < c.length(); i++) {
            d[i] = c.charAt(i) - '0';

            System.out.println(d[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < e.length(); i++) {
            f[i] = e.charAt(i) - '0';
            System.out.println(f[i]);
        }

        System.out.println(" ");

        int[] p = {5, 6, 7, 8, 9, 8};
        int[] l = {1, 2, 3, 2, 4, 4};
        int[] a = new int[5];
        int remainder = 0;

        for (int i=5; i <= 0; i--) {
            a[i] = l[i] + p[i] + remainder;
            if (a[i] >= 10) {
                a[i] = a[i] % 10;
                remainder = a[i] / 10;
            }
            System.out.println(a[i]);
        }


    }
}
