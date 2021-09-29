package varialble.learning;

import java.util.Scanner;
class Pasca
{
    public static void main(String[] args) {
        int num = 0;
        int rev = 0;

        Scanner a = new Scanner(System.in);
        System.out.println("Enter Your Number");
        num=a.nextInt();

        while (num>0){
            rev = rev * 10;
            rev = rev + num%10;
            num = num/10;
        }
        System.out.println(rev);


        String c = "Rahul";
        char rr = c.charAt(0)  ;
        System.out.println(rr);
    }
}
