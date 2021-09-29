package varialble.learning;

public class Functions {
    public static void main(String[] args) {
        Functions obj = new Functions();

        int x = 5;
        int y = 6;
        int z = add(5,6);
        System.out.println(z);

    }

    public static int add(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }
}




