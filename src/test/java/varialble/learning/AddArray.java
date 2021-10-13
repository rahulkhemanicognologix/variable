package varialble.learning;

public class AddArray {
    public static void main(String[] args) {

        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {{4, 5, 6}, {1, 2, 3},{7, 8, 9}};
        int[][] c = new int[3][3];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                for (int k = 0; k < 3; k++) {
                    sum = a[i][k] * b[k][j];
                }
                c[i][j] = sum;
                sum = 0;
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}

