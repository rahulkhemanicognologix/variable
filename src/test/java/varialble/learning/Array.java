package varialble.learning;

public class Array {
    public static void main(String[] args) {
        int[] r = {10, 20, 30};
        for (int i = 0; i <= 2; i++) {
            System.out.println(r[i]);
        }
        System.out.println(" ");

        int [] d = new int[5];
        d[0] = 1;
        d[1] = 2;
        d[2] = 3;
        d[3] = 4;
        d[4] = 5;

        for(int i=0; i<d.length;i++){
            System.out.println(d[i]);
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
