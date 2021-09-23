package varialble.learning;

public class Practiceifelse {
    public static void main(String[] args) {


       int length = 10;
        int breadth = 10;

        if ((length > breadth) && breadth < length) {
            System.out.println("This is a rectangle");
        } else if (length == breadth && breadth == length) {
            System.out.println("This is a square");
        } else
            System.out.println("This is not a rectangle");
        int a = 50;
        int  b = 30;
        if (a> b ) {
            System.out.println("A is bigger number ");
        } else if(b>a) {
            System.out.println("B is bigger number");
        }
        else {
            System.out.println("Both are equal");
        }


    }
}



