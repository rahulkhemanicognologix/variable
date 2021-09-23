package varialble.learning;

import java.util.Scanner;
class Pasca
{
    public static void main(String args[])
    {
        int num=0;
        int rev =0;
        System.out.println("Input your number and pre enter: ");

        Scanner in = new Scanner(System.in);

        num = in.nextInt();

        while( num != 0 )
        {
            rev = rev * 10;
            rev = rev + num%10;
            num = num/10;
        }

        System.out.println("Reverse of input number is: "+rev);
    }
}
