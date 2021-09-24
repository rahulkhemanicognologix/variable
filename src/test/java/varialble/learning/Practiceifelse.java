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
        }
        else if(b>a) {
            System.out.println("B is bigger number");
        }
        else {
            System.out.println("Both are equal");
        }

        int age=16;
        int weight = 50;
        if(age>18) {
            if (weight > 48) {
                System.out.println("You are eligible");
            } else {
                System.out.println("You are ineligable");
            }
        }else
            System.out.println("You are under age");
            }

        }






