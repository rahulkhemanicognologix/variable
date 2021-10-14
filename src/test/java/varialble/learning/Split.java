package varialble.learning;

public class Split {
    public static void main(String[] args) {


        int x = 18;
        int remainder = 0;

        while (x > 0) {
            remainder = x % 10;
            x = x /10;
            System.out.println(remainder);
        }
    }
}
        /*int [] r  = {5, 6, 7, 8, 9, 2};
        int sum = 0;
        for (int i = 0; i < r.length; i++) {
                sum = sum + r[i];
        }
        System.out.println(sum);
        }*/