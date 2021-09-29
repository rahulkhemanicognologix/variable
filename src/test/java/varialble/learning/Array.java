package varialble.learning;

public class Array {
    public static void main(String[] args) {
        int[] r = {10, 20, 30};
        for (int i = 0; i <= 2; i++) {
            System.out.println(r[i]);
        }
        System.out.println(" ");

        int[][] a = {{10, 20, 30}, {11, 12, 13}, {14, 15, 16}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}
