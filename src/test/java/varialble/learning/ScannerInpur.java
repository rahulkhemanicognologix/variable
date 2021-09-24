package varialble.learning;

import java.util.Scanner;
public class ScannerInpur {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        String name = "" ;
        System.out.println("Enter Your name");
        name = a.nextLine();
        System.out.println(name);

        int number = 1;
        System.out.println("Enter your number");
        number =a.nextInt();
        System.out.println(number);

        float number2 = 1;
        System.out.println("Enter Number");
        number2 = a.nextFloat();
        System.out.println(number2);
    }

    }



