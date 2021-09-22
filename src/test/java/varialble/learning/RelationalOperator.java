package varialble.learning;

import java.sql.SQLOutput;

public class RelationalOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 5;
        int d = 6;
        int e = 11;
        String name = "Rahul";
        String name2= "Rahul";

        String name3 = new String ("Rahue");
        String name4 = new String("Rahul");
        String name5="Rahul";

        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));


        System.out.println(a>b);
        System.out.println(b<c);
        System.out.println(a<=e);
        System.out.println(d>=c);
        System.out.println(a!=e);
        System.out.println(c>=b);
        System.out.println(a!=b);

        System.out.println(name==name2);
        System.out.println(name==name3);
        System.out.println(name3==name4);
        System.out.println(name4==name5);


    }
}
