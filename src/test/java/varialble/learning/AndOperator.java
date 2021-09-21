package varialble.learning;

public class AndOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;
        int d = 15;

        System.out.println(a>b&&b>c);
        System.out.println(a>c&b>c);
        System.out.println(d++>c&&b>d);
        System.out.println(++d>c&b>a);
        System.out.println(++d>c&&c>a);
        System.out.println(a>d&++c>d);
        System.out.println(d>a&b>d);
        System.out.println(d>a&++d>c);

    }
}
