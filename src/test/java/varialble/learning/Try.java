package varialble.learning;

public class Try {
    public static void main(String[] args) {

        String a = "aabaa";

        boolean flag = true;

        for (int i = 0, j = a.length() - 1; i < a.length(); i++, j--) {

            if (a.charAt(i) != a.charAt(j)) {
                flag = false;
                break;
            }
        }

        System.out.println(flag);


        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
        int v = 5;
        int b = 6;
        int c = v + b;
        System.out.println(c);

        int p [] = {1,2,3,4,5};
        int l [] = {2,3,4,5,6};


    }
}
